package lesson8.task19;

//Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
//        учесть, что слова могут разделяться несколькими пробелами, в начале и конце
//        текста также могут быть пробелы, но могут и отсутствовать.

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task19 {
    public static void main(String[] args) {

        String s = "Java is a class-based, object-oriented programming language";
        String regex = "\\w+";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(s);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println(count);

    }
}
