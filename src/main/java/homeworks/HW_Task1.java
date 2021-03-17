package homeworks;// 1)В переменную записываем число. Надо вывести на экран сколько в этом числе цифр
//  и положительное оно или отрицательное. Например, "это однозначное положительное число". 
//  Достаточно будет определить, является ли число однозначным, "двузначным или трехзначным и более.

public class HW_Task1 {

    public static void main(String[] args) {

        newNumber(-6886);

    }

    public static void newNumber(int i) {

        if (i > 0) {
            System.out.println("This is positive number!");
        } else
            System.out.println("This is negative number!");

        if (i > -9 && i < 9) {
            System.out.println("This is single digit !");
        }

        else if (i > -99 && i < -10 || i > 10 && i < 99) {
            System.out.println("This is two digit!");
        } else if (i > -999 && i < -100 || i > 100 && i < 999) {
            System.out.println("This is three digit!");
        } else
            System.out.println("This number contains more than three digits!");
    }
}
