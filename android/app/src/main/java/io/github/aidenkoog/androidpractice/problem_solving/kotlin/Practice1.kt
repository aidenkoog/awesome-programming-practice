package io.github.aidenkoog.androidpractice.problem_solving.kotlin

class Practice1 {
    // 문자열 포함 여부
    fun solution(my_string: String, target: String): Int = if (my_string.contains(target)) 1 else 0

    // 문자열 포함 여부 + 대 소문자 구
    fun solution2(myString: String, pat: String): Int {

        // contains 대신 in 사용
        val result = if (pat.lowercase() in myString.lowercase()) 1 else 0

        // takeIf {} 사용, contains 두번 째 인자로 ignoreCase 옵션 설정 가능.
        val result2 = 1.takeIf { myString.contains(pat, true) } ?: 0

        // contains
        val result3 = if (myString.contains(pat, true)) 1 else 0

        return if (myString.uppercase().contains(pat.uppercase())) 1 else 0
    }

    // 배열 아이템 개수 만큼 빈 배열 맨 뒤에 아이템 추가
    fun solution3(intArray: IntArray): IntArray {
        // 빈 배열 생성
        var answer: IntArray = intArrayOf()

        // 예. [5, 1, 4] 중 5이면
        for (element in intArray) {
            var count = 0
            // 5 만큼 반복문 수행
            while (count++ < element) {
                answer += element
            }
        }
        return answer
    }

    // 배열 요소들의 합 및 곱
    fun solution4(num_list: IntArray): Int {
        var answer = 0
        val listSize = num_list.size
        if (listSize >= 11) {
            for (item in num_list) {
                answer += item
            }
        } else {
            for (item in num_list) {
                if (answer == 0) {
                    answer = item
                    continue
                }
                answer *= item
            }
        }
        return answer
    }

    // 배열 요소들의 합 및 곱
    fun solution5(numList: IntArray): Int {
        return if (numList.size >= 11) {
            numList.sum()
        } else {
            // 배열 fold, reduce
            numList.fold(1) { total, num -> total * num }
        }
    }
}