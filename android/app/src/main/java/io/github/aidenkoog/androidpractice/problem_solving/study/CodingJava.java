package io.github.aidenkoog.androidpractice.problem_solving.study;

public class CodingJava {
    public static void main(String[] args) {
        System.out.println("test");

        // java.lang.String
    }

    public static void practice() {
        // String
        String str = "adsdfsdfs";
        str = "sdfhsdkfjshdkf";

        char[] tempArr = str.toCharArray();
        tempArr[4] = 'R';
        str = new String(tempArr);
        System.out.println(str);

        String newStr = str.substring(0, 4) + "R" + str.substring(4, 7);

        // constant String pool. (Java Heap 내 따로 공간이 있음)
        // strLiteral과 2는 같음 (==)
        String strLiteral = "test";
        String strLiteral2 = "test";

        // Java Heap.
        String strObject = new String("test");

        // 스트링 메소드
        // charAt / length / equals / compareTo / toCharArray / contains / replace / split /
        // substring / indexOf (문자의 위치를 반환) / toLowerCase / toUpperCase
    }
}
