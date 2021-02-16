
//Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа
//различны?

public class Task5 {
    public static void main(String[] args){

        int numer = 1231;

        String s = Integer.toString(numer);
        int[] n = new int[s.length()];
        for(int i = 0; i < s.length(); i++){
            n[i] = Character.getNumericValue(s.charAt(i));
        }
        if( n[0]!= n[1] && n[0]!= n[2] && n[0]!=n[3] && n[1]!=n[2] && n[1]!=n[3] && n[2]!=n[3]){
            System.out.println("All numbers are diferent!");
        }
        else System.out.println("No all numbers are different!");
    }
}
