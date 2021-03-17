package homeworks;//Создать последовательность случайных чисел, найти и вывести наибольшее
//из них.

public class Task13 {
    public static void main(String[] args) {

        int[] list = { 5, 62, 71, 8, 41, 2, 5, -78, -9, 2, 0 };

        int max = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];
        }

        System.out.println("Max is " + max);
    }

}
