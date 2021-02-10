// 7)Напишите программу, определяющую сумму всех нечетных чисел от 1до 99

public class HW_Task7_Ls5 {
    public static void main(String[] args) {

        
        int count = 0;
        for (int i = 0; i < 99; i++) {
            if (i % 2 != 0) {

                count += i;

            }

        }
        System.out.println(count);

    }
}
