// 3) Дано целое число. Если оно является положительным, то прибавить к нему 1.Если отрицательным,
//  то вычесть из него 2. Если нулевым, то заменить его на 10. Вывести полученное число

public class HW_Task3 {
    public static void main(String[] args) {

        newNumber(88);

    }

    public static void newNumber(int i) {
        if (i > 0) {
            i = i + 1;
            System.out.println(i);
        } else if (i < 0) {
            i = i - 2;
            System.out.println(i);
        } else if (i == 0) {
            i = i + 10;
            System.out.println(i);
        }
    }
}
