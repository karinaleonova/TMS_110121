// 6)Напишите программу вывода всех четных чисел от 2 до 100 включительно


public class HW_Task6_Ls5 {
    public static void main(String[] args) {
        

        int [] num = new int[100];
        for (int i = 1 ; i <= num.length; i++){
            if(i % 2 == 0 ){
                System.out.println(i);
            }
        }
    }
}
