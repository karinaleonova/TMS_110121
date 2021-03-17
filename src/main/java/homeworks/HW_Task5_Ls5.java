package homeworks;// 5)Напишите программу печати таблицы перевода расстояний из дюймов
//  всантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

public class HW_Task5_Ls5 {

    public static void main(String[] args) {

        double count = 1;
        for (double i = 1; i <= 20; i++) {

            count = i * 2.54;

            System.out.println(i + " inch = " + count + " centimetr ");
        }

    }
}
