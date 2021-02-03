//.4) Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

public class HW_Task4 {
    public static void main(String[] args) {

        positiveNumber(-1, -2, -3);

    }

    public static void positiveNumber(int a, int b, int c) {

        if (a > 0 && b > 0 && c > 0) {
            System.out.println("Three positive numbers !");
        }
        if (a > 0 && b > 0 && c < 0 || a > 0 && b < 0 && c > 0 || a < 0 && b > 0 && c > 0) {
            System.out.println("Two positive numbers !");
        }
        if (a < 0 && b < 0 && c > 0 || a < 0 && b > 0 && c < 0 || a > 0 && b < 0 && c < 0) {
            System.out.println("One positive numbers !");
        } else
            System.out.println("No positive numbers !");

    }

}
