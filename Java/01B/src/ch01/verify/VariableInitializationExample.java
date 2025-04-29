package ch01.verify;

public class VariableInitializationExample {
    // 변수가 초기화되지 않아서 오류가 발생하였다.
        public static void main(String[] args) {
            int value = 0; // 해결 코드
            // int value; // 기존 코드
            int result = value + 10;
            System.out.println(result);
        }
    }

