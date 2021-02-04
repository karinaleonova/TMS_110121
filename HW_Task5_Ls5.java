// 5)Напишите программу печати таблицы перевода расстояний из дюймов
//  всантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см

public class HW_Task5_Ls5 {

    public static void main(String[] args) {

        double[] num = new double[20];
        for (double i = 0; i <= num.length; i++) {
            num[(int) i] = i + 1;

            num[(int) i] *= 2.54;

            System.out.println(i + 1 + " inch = " + num[(int) i] + " centimetr ");
        }

    }
}
