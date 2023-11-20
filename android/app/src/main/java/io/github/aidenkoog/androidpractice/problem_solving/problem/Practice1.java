package io.github.aidenkoog.androidpractice.problem_solving.problem;

import java.util.ArrayList;

public class Practice1 {
    // 부분 문자열 유무 판단
    public int solution(String my_string, String target) {
        // indexOf 결과가 -1 보다 크면 포함된 것이라 판단.
        int result = my_string.indexOf(target) > -1 ? 1 : 0;

        return my_string.contains(target) ? 1 : 0;
    }

    // 부분 문자열 유무 판단 + 대 소문자 구별
    public int solution2(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase()) ? 1 : 0;
    }

    // 배열 아이템 개수 만큼 빈 배열 맨 뒤에 아이템 추가
    public int[] solution3(int[] arr) {
        int[] answer;

        // 빈 배열에 엘리먼트 삽입이 불가능하므로 일단 리스트 생성
        ArrayList<Integer> list = new ArrayList<>();
        for (int element : arr) {
            int count = 0;
            while (count++ < element) {
                // 리스트에 값 추가
                list.add(element);
            }
        }
        // 리스트는 Integer 즉, int의 Wrapper 이므로 int로 만들어서 배열을 생성 후 반환.
        answer = list.stream().mapToInt(i -> i).toArray();
        return answer;
    }

    // 배열 아이템 개수 만큼 빈 배열 맨 뒤에 아이템 추가 2번째 풀이
    public int[] solution4(int[] arr) {
        int[] answer;
        int sum = 0;

        // [5, 1, 4] --> 결국 5 + 1 + 4 => 10개의 요소를 갖는 배열이 필요
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        // 배열 초기화
        answer = new int[sum];

        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i]; j++) {
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}
