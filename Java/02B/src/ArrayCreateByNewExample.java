package ch05.sec06;

public class ArrayCreateByNewExample {
    public static void main(String[] args) {
        double[] arr1 = new double[3];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("arr1[" + i + "] = " + arr1[i] + ", ");
        }
        System.out.println();

        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;

        for (int i = 0; i < arr1.length; i++) {
            System.out.print("arr1[" + i + "] = " + arr1[i] + ", ");
        }
        System.out.println("\n");

        String[] arr2 = new String[3];
        for (int i = 0; i < arr2.length; i++) {
            System.out.print("arr2[" + i + "] = " + arr2[i] + ", ");
        }
        System.out.println();

        arr2[0] = "1월";
        arr2[1] = "2월";
        arr2[2] = "3월";

        for (int i = 0; i < arr2.length; i++) {
            System.out.print("arr2[" + i + "] = " + arr2[i] + ", ");
        }
    }
}
