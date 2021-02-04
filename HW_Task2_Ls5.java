// 2)Одноклеточная амеба каждые 3 часа делится на 2 клетки. 
// Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.

public class HW_Task2_Ls5 {
    public static void main(String[] args) {

        int amb1 = 1;

        for (int i = 1; i <= 8; i++) {
            amb1 = amb1 * 2;

            System.out.println(amb1);

        }

    }

}
