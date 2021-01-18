public class Task4 {
    public static void main(String[] args)throws Exception{
        
        numberReverse(5589067);

    }
     public static void numberReverse(int number){

        if (number < 10) {
            System.out.println(number);
            return;
        } else {
            System.out.print(number % 10);
            numberReverse(number / 10);
        }
  }
}

