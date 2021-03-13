package lesson15.dopTask2;

//2)Текстовый файл содержит текст. После запуска программы в другой файл
//        должны записаться только те предложения в которых от 3-х до 5-ти слов. Если в
//        предложении присутствует слово-палиндром, то не имеет значения какое кол-во
//        слов в предложении, оно попадает в новый файл.
//        В main считываем файл.
//        Разбиваем текст на предложения. Используя методы класса TextFormatter
//        определяем подходит ли нам предложение. Если подходит добавляем его в
//        новый файл


import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Task2 {
    public static void main(String[] args) throws Exception{
        String fileName = "src/main/java/Lesson15/dopTask2/text.txt";
        ArrayList<String> arr = new ArrayList<>();
        Set<String> newArr = new HashSet<>();

        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));

        String string;
        while((string = reader.readLine())!= null){
            for(String sentence : string.split("[.?!]+")) {
                arr.add(sentence);
           }
        }
        for(int i = 0; i < arr.size(); i++){
            int num = TextFormatter.returnWordsNum(arr.get(i));
            boolean b = TextFormatter.isPalindrome(arr.get(i));

            if((num >= 3 && num <=5)||b==true){
                newArr.add(arr.get(i));
            }
        }
        DataOutputStream a;
        try {
            a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/Lesson15/dopTask2/newText2.txt")));
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        for(String s : newArr){
            a.writeUTF(s + "\n");
        }
        reader.close();
        a.close();
    }
}
