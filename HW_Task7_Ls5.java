// 7)Напишите программу, определяющую сумму всех нечетных чисел от 1до 99

public class HW_Task7_Ls5 {
    public static void main(String[] args) {

        int[] num = new int[99];
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            if (num[i] % 2 != 0) {

                count += num[i];

            }

        }
        System.out.println(count);

    }
}
