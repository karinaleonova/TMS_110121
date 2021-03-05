package Lesson15.dopTask2;

//Пишем все в ООП стиле. Создаём класс TextFormatter
//        в котором два статических метода:
//        1. Метод принимает строку и возвращает кол-во слов в строке.
//        2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если
//        есть возвращает true, если нет false

import java.util.ArrayList;

public class TextFormatter {

    public static int returnWordsNum(String s){

        ArrayList<String> arr = new ArrayList<>();
        for(String word : s.split("[-#$%^&!?,.0-9\\s]+")) {
            arr.add(word);
        }
        int count = arr.size();
        return count-1;
    }

    public static boolean isPalindrome(String s){
        int c = 0;
        ArrayList<String> arr = new ArrayList<>();
        for(String word : s.split("[-#$%^&!?,.0-9\\s' ']+")) {
            arr.add(word);
        }

        for(int i =0; i< arr.size(); i++){

            StringBuffer rev = new StringBuffer(arr.get(i)).reverse();
            String st = rev.toString();

            if(arr.get(i).equalsIgnoreCase(st) && arr.get(i).length() != 1){
                c++;
            }
        }

        if(c >= 1) return true;
        else return false;
    }
}
