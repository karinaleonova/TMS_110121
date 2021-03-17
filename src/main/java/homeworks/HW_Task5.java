package homeworks;//5) Даны 3 целых числа. Найти количество положительных и отрицательных чисел в исходном наборе.

public class HW_Task5 {
    public static void main(String[] args) {

        int[] array = { 3, 0, 2 };
        int positive = 0;
        int negative = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

            if (array[i] > 0) {
                positive++;
            } else if (array[i] < 0)
                negative++;

        }
        System.out.println("Positive : " + positive + " Negative : " + negative);

    }

}
