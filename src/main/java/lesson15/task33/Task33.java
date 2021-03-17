package lesson15.task33;

//Создать файл с текстом, прочитать, посчитать в тексте количество знаков
//        препинания и слов.

import java.io.*;

public class Task33 {
    public static void main(String[] args) throws Exception {

        String fileName = "src/main/java/Lesson15/Task33/text.txt";
        File file = new File(fileName);

        int count = 0;
        try (FileReader fr = new FileReader(file)) {
            char[] chars = new char[(int) file.length()];
            fr.read(chars);

            String fileContent = new String(chars);
            System.out.println("Number of words: " + fileContent.split(" ").length);

            for( int i = 0; i < chars.length; i++ ) {
                if (Character.toString(chars[i]).matches(".*[.,!?]"))
                    count++;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Number of punctuation: " + count);
        }
    }