// 7)  В переменную записываете количество программистов. В зависимости от количества
//  программистов необходимо вывести правильно окончание. Например:
//   • 2 программиста • 1 программиста • 10 программистов • и т.д.

public class HW_Task7 {
    public static void main(String[] args) {
        newProgrammer(4446);

    }

    public static void newProgrammer(int i) {
        if (i == 1) {
            System.out.println(i + " программист");
        } else if (i % 10 == 2 || i % 10 == 3 || i % 10 == 4) {
            System.out.println(i + " программистa");

        } else
            System.out.println(i + " программистов");
    }

}
