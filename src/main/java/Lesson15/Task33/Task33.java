package Lesson15.Task33;

//Создать файл с текстом, прочитать, посчитать в тексте количество знаков
//        препинания и слов.

import java.io.*;
import java.util.Scanner;

public class Task33 {
    public static void main(String[] args) throws Exception {

        String fileName = "src/main/java/Lesson15/Task33/text.txt";

        File file = new File(fileName);
        FileReader fileInputStream = new FileReader(file);
        Scanner sc = new Scanner(new FileInputStream(file));

        int commaCount = 0;
        int wordCount=0;
        int res = fileInputStream.read();

        while(sc.hasNext()){
            sc.next();
            wordCount++;
        }

        while (res != -1) {
            if (res >= 33 && res <= 46) commaCount++;

            res = fileInputStream.read();
        }
        fileInputStream.close();

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of punctuation: " + commaCount);
        }
    }

