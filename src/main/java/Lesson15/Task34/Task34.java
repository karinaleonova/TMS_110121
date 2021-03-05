package Lesson15.Task34;

//Имеется файл с текстом, в котором присутствуют числа. Найти все числа,
//        распечатать, посчитать сумму, убрать все повторяющиеся числа и снова
//        распечатать.

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Task34 {
    public static void main(String[] args) throws Exception {
        String fileName = "src/main/java/Lesson15/Task34/num.txt";
        Set<String> set = new HashSet<>();
        String s = null;
        String ss = null;
        int sum = 0;

        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));

            while ((s = reader.readLine()) != null) {
                String [] p = s.split("[\\\\/№;:а-яА-Яa-zA-Z?!,.\\-(){}\\[\\]@#\\$%^&?*~<>\\s]+");

                for(String s1 : p) {
                    set.add(s1);
                    System.out.print(s1 + " ");
                    if(s1.length()>0)
                        sum += Integer.parseInt(s1);
                }
            }
        System.out.println(" \n All numbers sum : " + sum);
            for(String i : set){
                System.out.print(i + " ");
            }
        reader.close();
    }
}