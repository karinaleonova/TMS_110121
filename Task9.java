import static java.lang.Math.random;

//Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а
//произведение, т.е. факториал числа.

public class Task9 {
    public static void main(String[] args) {

        double averageMult = 0;
        double mult = 1;
        int n = 0;
        int x = (int) (random() * 20);

        while (x != 0) {
            mult *= x;
            n++;
            x = (int) (random() * 20);
        }
        if (n != 0) {
            averageMult = mult / n;
        } else {
            averageMult = 0;
        }

        System.out.println("среднее:" + averageMult);

    }
}