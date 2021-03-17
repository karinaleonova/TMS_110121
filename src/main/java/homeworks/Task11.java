package homeworks;//Имеется целое число, определить является ли это число простым, т.е.
//делится без остатка только на 1 и себя.

public class Task11 {
 

        public static void main(String[] args) {

            newNumber(112);
        }
    
        public static void newNumber(int n) {
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    count++;
                }
            }
            if (count > 0) {
                System.out.println("Isn't is a simple number .");
            } else
                System.out.println("It is a simple number.");
    
        }
}
