package homeworks;// 1)Начав тренировки, спортсмен в первый день пробежал 10 км.
// Каждыйдень он увеличивал дневную норму на 10% нормы предыдущего дня.
//  Какойсуммарный путь пробежит спортсмен за 7 дней?

public class HW_Task1_Ls5 {
    public static void main(String[] args) {
        double kmForDay = 10;
        double sum = 10;

        for (double i = 1; i < 7; i++) {
            double prForDAy = kmForDay * 0.1;
            kmForDay = kmForDay + prForDAy;
            System.out.println(kmForDay);
            sum += kmForDay;

        }
        System.out.println(sum);
    }

}
