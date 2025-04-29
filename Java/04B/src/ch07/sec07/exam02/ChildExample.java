package ch07.sec07.exam02;

public class ChildExample {
    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = child;

        parent.method1();
        parent.method2();

        // 잘못된 코드 제거
        // parent.method3(); // (Parent 타입이라 method3() 호출 불가)
    }
}

