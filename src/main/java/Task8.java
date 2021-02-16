import java.util.Random;

//Имеется целове число (задать с помощью Random rand = new Random(); int x =
//rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
//нему слово «рублей» в правильном падеже.
 


public class Task8 {
    public static void main(String[] args){

        Random rand = new Random();
        int x = rand.nextInt(); 
    
        
         if ( x% 10 == 1 ){
            System.out.println(x + " рубль");
        }
         else if ( x % 10 == 2 ){
            System.out.println(x + " рубля");
        }
        else if ( x % 10 == 3 ){
            System.out.println(x + " рубля");
        }
        else if ( x % 10 == 4 ){
            System.out.println(x + " рубля");
        }
        else if ( x > 0 ) {
            System.out.println(x + " рублей");
        }
    }
}

    


