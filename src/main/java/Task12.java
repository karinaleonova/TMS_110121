
public class Task12 {
    public static void main(String[] args) {

        int sum = 0;
        int k = 1;
        for (int i = 1; k <= 3; i++) {
            if (i % 3 == 0) {
                System.out.println("Number is divisible by 3 - " + i);
                k++;
                sum += i;
            }
        }
        System.out.println("Sum of 3 numbers = " + sum);

    }
}