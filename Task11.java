//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.

public class Task11 {
    public static void main(String[] args) {

        newNumber(2);
    }

    public static void newNumber(int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (n % 2 == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("It is a simple number .");
        } else
            System.out.println("Isn't a simple number.");
    }
}
