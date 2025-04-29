package org.scoula.lib;

public class InputTest {
    public static void main(String[] args) {
        String name = org.scoula.lib.Input.read("이름: ");
        System.out.println("입력값: " + name);

        String name2 = org.scoula.lib.Input.read("이름", "홍길동");
        System.out.println("입력값: " + name2);

        int age = org.scoula.lib.Input.readInt("나이: ");
        System.out.println("입력값: " + age);

        boolean answer = org.scoula.lib.Input.confirm("종료할까요?");
        System.out.println("입력값: " + answer);

        boolean answer2 = org.scoula.lib.Input.confirm("종료할까요?", true);
        System.out.println("입력값: " + answer2);
    }
}
