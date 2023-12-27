package io.github.aidenkoog.androidpractice.refactoring;

/*
 * 정의: 외부에서 보는 프로그램 기능은 변하지 않고 프로그램의 내부 구조를 개선
 * 동작 버그 판단을 위해 유닛 테스트 필요
 * 테스트 -> 리팩토링 -> 테스트 ...
 * 수정하거나 기능 추가하기 쉽게 하기 위한 목적
 */
public class RefactoringMain {
    /*
     * 긴 메소드
     * 방대한 클래스
     * 변경점 많음
     * 다른 클래스 속성, 조작을 하는 클래스가 존재하는 경우
     * 많은 조건 분기
     * 과다한 매개 변수 (메소드 오버로딩 등)
     * 변수, 메소드, 필드, 패키지명
     * 기본타입, 객체화할 수 있는 것들은 객체화
     * 하는 일이 없는 클래스 (오버 엔지니어링)
     * 무의미한 상위 클래스 (오버 엔지니어링)
     * 메세지 연쇄 (메소드 호출 시 연쇄 동작 김)
     * 너무 많은 주석 처리
     */
}

/*
 * 매직 넘버를 상수로 바꾸기
 * - 의미 파악 어려움, 수정 어려움, 상수로 치환하여 리팩토링 권장
 * 제어 플래그 삭제
 * - break, return 등의 제어문으로 교체
 * - 먼저 이상한 변수명 변경 (단계적으로 리팩토링 진행)
 */
class Test {
    public void order(int command) { // <-- Command command (Enumeration Recommended)
        if (command == 0) { // <-- Magic Number, public static final COMMAND_COMPLETED = 0;

        } else if (command == 1) {
            // ...
        }
    }

    // 상수 하드코딩 자체를 막기 위해서는 아래 Enum 타입을 사용해야 함.
    enum Command {
        CMD_1, CMD_2, CMD_3
    }
}