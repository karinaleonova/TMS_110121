package lesson8.task22;

//Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
//        записаных по правилам Java, с помощью регулярных выражений и вывести их на
//        страницу.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task22 {
    public static void main(String[] args) {


        String s = "0123456789 FF 00x1F";
        Pattern pattern = Pattern.compile(".*0[Xx]?[0-9]?[a-fA-F]?[0-9].*");
        Matcher matcher = pattern.matcher(s);

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }

    }

}
