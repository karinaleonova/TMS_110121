//Создайте число. Определите, является ли число трехзначным. Определите, является
//ли его последняя цифра семеркой. Определите, является ли число четным.


public class Task6 {
    public static void main(String[] args){
        int i = 137; 

        if ( i >=100 && i <= 999 ){
            System.out.println("This is a three-digit number ");
        }
        if ( i % 2 == 0){
            System.out.println("This is an even number ");
        }
        int l = i / 10;
        l = i - l * 10;
        if( l == 7){
            System.out.println("The last number is 7");
        }
        if( i % 10 == 7){
            System.out.println("The last number is 7");
        }
        
    }
    
}

/*  int i = 132;
    int n1 = i / 10;
    n1 = i - n1 * 10;
    return n1;*/
