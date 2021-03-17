package homeworks;//.4) Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

public class HW_Task4 {
    public static void main(String[] args) {

        System.out.println(positiveNumber(1, 2, 3));

    }

    public static  int positiveNumber(int a, int b, int c) {
            int count = 0;  
            if(a > 0) count++;
            if(b > 0) count++;
            if(c > 0) count++;

            return count;

        }
        
        

    

    }

