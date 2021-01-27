//Определите сумму элементов одномерного массива, расположенных между
//минимальным и максимальным значениями.

public class Task16 {
    public static void main(String[] args) {

        int[] list = new int[10];
        int sum = 0;
        for (int i = 0; i < list.length; i++) {
            list[i] = i;
            sum += list[i];

        }
        System.out.println("Sum is : " + sum);

    }
}
