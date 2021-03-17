package homeworks;// 2) Треугольник существует только тогда, когда сумма любых двух его сторон больше третьей.
// Определить существует ли такой треугольник. Дано: a, b, c –стороны предполагаемого треугольника. 
// Требуется сравнить длину каждого отрезка-стороны с суммой двух других. 
// Если хотя бы в одном случае отрезок окажется больше суммы двух других, то треугольника 
// с такими сторонами не существует.

public class HW_Task2 {
    public static void main(String[] args) {

        newTriangle(6, 8, 154);

    }

    public static void newTriangle(int a, int b, int c) {

        if (a <= b + c && b <= a + c && c <= a + b) {
            System.out.println(" Triangle exist");
        } else
            System.out.println(" Triangle not exist");

    }
}
