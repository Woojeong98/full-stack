package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("원의 넓이: " + calculator.areaCircle(10));

        Computer computer = new Computer();
        System.out.println("원의 넓이: " + computer.areaCircle(10));
    }
}
