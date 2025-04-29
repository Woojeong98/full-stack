package ch04.sec03;

public class SwitchNoBreakCaseExample {
    public static void main(String[] args) {
        // 8, 9, 10, 11 중 하나를 무작위로 선택
        int time = (int)(Math.random()*4)+8;

        // 현재 시간 출력
        System.out.println("[현재시간: " + time + " 시]");

        switch(time) {
            case 8:
                // time이 8이면 실행
                System.out.println("출근합니다.");
                // break가 없으므로 이어서 case 9 실행
            case 9:
                // time이 9이거나 위의 case 8에서 break 없이 넘어온 경우 실행
                System.out.println("회의를 합니다.");
                // break가 없으므로 이어서 case 10 실행
            case 10:
                // time이 10이거나 위에서 넘어온 경우 실행
                System.out.println("업무를 봅니다.");
                // break가 없으므로 이어서 default 실행
            default:
                // case에 해당하지 않거나, 위에서 내려온 경우 실행
                System.out.println("외근을 나갑니다.");
                // default는 항상 마지막이라 break 필요 없음
        }
    }
}
