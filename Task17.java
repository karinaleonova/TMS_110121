//Создать двухмерный квадратный массив, и заполнить его «бабочкой»

public class Task17 {
    public static void main(String[] args) {

        int[][] arr = new int[5][5];

        for (int i = 0; i < arr.length / 2 + 1; i++) {
            for (int j = i; j < arr.length - i; j++) {
                arr[i][j] = 1;
                arr[arr.length - i - 1][j] = 1;
            }
        }
        for (int[] r : arr) {
            for (int value : r) {
                System.out.print(" " + value + " ");
            }
            System.out.println();
        }
    }
}
