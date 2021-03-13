package lesson15.task34;

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
        int sum = 0;

        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));

            while ((s = reader.readLine()) != null) {
                String [] p = s.split("[^0-9]");
                for (int i = 0; i < p.length; i++) {

                    if (!p[i].equals("")) {
                        System.out.print(p[i] + " ");
                        sum += Integer.parseInt(p[i]);
                        set.add(p[i]);
                    }
                }
            }
        System.out.println(" \n All numbers sum : " + sum);
            for(String i : set){
                System.out.print(i + " ");
            }
        reader.close();
    }
}