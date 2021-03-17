package homeworks;//Создайте число. Определите, является ли число трехзначным. Определите, является
//ли его последняя цифра семеркой. Определите, является ли число четным.


public class Task6 {
    public static void main(String[] args){
        int i = 1142; 

        if ( i >=100 && i <= 999 ){
            System.out.println("This is a three-digit number ");
        }
        else System.out.println("Isn't a three-digit number ");

        if ( i % 2 == 0){
            System.out.println("This is an even number ");
        }
    
        if( i % 10 == 7){
            System.out.println("The last number is 7");
        }
        else System.out.println("The last number is not 7");
        
    }
    
}
