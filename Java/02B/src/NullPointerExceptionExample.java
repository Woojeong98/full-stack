package ch05.sec04;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        int[] intArray = null; // 배열을 아직 만들지 않았는데 바로 사용하려고 함

        intArray[0] = 10; // (i) // 배열이 null이라서 0번째 칸에 접근하면 NullPointerException 발생함!
        // 배열을 먼저 new로 만들어야 사용할 수 있음!

        String str = null; // 문자열을 null로 초기화했음 (아직 아무 문자열도 없음)

        System.out.println("총 문자 수: " + str.length()); // (ii) // null은 length() 같은 메서드를 쓸 수 없음
        // 먼저 문자열을 넣어줘야 함 (예: str = "Hello";)
    }
}
