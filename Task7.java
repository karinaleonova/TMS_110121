//Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
//полностью закрыть круглой картонкой радиусом r.


public class Task7 {
    public static void main(String[] args){

        int r = 3 ;
        int a = 2  ;
        int b = 9;
        int abS = a * b;
        int rS = (int) (3.14 * r * r);

        if (rS > abS)
        System.out.println("Yes");
        else
        System.out.println("No");
    }
}
