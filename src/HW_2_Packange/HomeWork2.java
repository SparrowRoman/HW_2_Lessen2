package HW_2_Packange;

public class HomeWork2 {
    public static void main(String[] args) {

        System.out.println(from10to20(5, 28));
        System.out.println(positiveOrNegative(-8));
        System.out.println(numberIsPositiveOrNegative(5));
        System.out.println(printText(2));
    }

    public static boolean from10to20(int a, int b) {
        int c = a + b;
        return c >= 10 && c <= 20;
    }

    public static int positiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительное число!");
        } else {
            System.out.println("Отрицательное число!");
        }
        return a;
    }

    public static boolean numberIsPositiveOrNegative(int x) {
        if (x >= 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int printText(int x) {

        for (int z = 1; z == x; z++) {
            System.out.println("Text");
        }
    }



}