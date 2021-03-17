package homeworks;//Создать массив, заполнить его случайными элементами, распечатать,
//перевернуть, и снова распечатать (при переворачивании нежелательно создавать
//еще один массив).

public class Task15 {
    public static void main(String[] args) {

        int[] num = { 4, 6, 7, 8, 9, 3, 5, 9 };

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }

        System.out.println("**************");

        for (int i = 7; i < num.length; i--) {
            System.out.println(num[i]);
        }

    }

}
