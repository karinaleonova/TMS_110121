//Создать массив оценок произвольной длины, вывести максимальную и
//минимальную оценку, её (их) номера.

public class Task14 {
    public static void main(String[] args) {

        int[] list = { 5, 9, 7, 8, 4, 2, 5, 8, 3, 2, 6 };

        int max = list[0];
        int min = list[0];
        for (int i = 1; i < list.length; i++) {
            if (list[i] > max)
                max = list[i];

        }

        for (int i = 1; i < list.length; i++) {
            if (list[i] < min)
                min = list[i];
        }

        System.out.println("Max is " + max + ",is number : " + list[max]);
        System.out.println("Min is " + min + ", is number : " + list[min]);

    }

}
