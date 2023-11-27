package io.github.aidenkoog.androidpractice.problem_solving.study;

import java.time.LocalDate;

public class CodingJava {

    public static void main(String[] args) {
        practice();
        practiceLocalDate();
    }

    public static void run() {

    }

    public static void practiceLocalDate() {
        LocalDate date1 = LocalDate.parse("2021-01-01");
        LocalDate date2 = LocalDate.parse("2021-01-02");

        boolean isBefore = date1.isBefore(date2);
        System.out.println("date1이 date2보다 과거? " + isBefore);
    }

    public static void practice() {

        System.out.println("##################################################");
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
        System.out.println("##################################################");
    }
}
