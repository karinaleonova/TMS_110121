package lesson15.dopTask3;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

//3) Проверка на цензуру:
//        Создаете 2 файла.
//        1 - й. Содержит исходный текст.
//        2 - й. Содержит слова недопустимые в тексте(black list). Структура файла
//        определите сами, хотите каждое слово на новой строке, хотите через запятую
//        разделяйте, ваша программа делайте как считаете нужным.
//        Задача: необходимо проверить проходит ли текст цензуру. Если в тексте не
//        встретилось ни одного недопустимого слова, то выводите сообщение о том что
//        текст прошёл проверку на цензуру. Если нет, то выводите соответствуюущее
//        сообщение, кол-во предложений не прошедших проверку и сами предложения
//        подлежащие исправлению.
public class Task3 {
    public static void main(String[] args) throws Exception {

        String fileName = "src/main/java/Lesson15/dopTask3/story.txt";
        String nextName = "src/main/java/Lesson15/dopTask3/BlackList.txt";
        ArrayList<String> arr = new ArrayList<>();
        ArrayList<String> arrBlackList = new ArrayList<>();
        Set<String> noCensorList = new HashSet<>();


        File file = new File(fileName);
        File fileBlackList = new File(nextName);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        BufferedReader readerBlackList = new BufferedReader(new FileReader(fileBlackList));

        String string;
        while((string = reader.readLine())!= null){
            for(String sentence : string.split("[.?!]+")) {
                arr.add(sentence);
            }
        }
        String s;
        while((s = readerBlackList.readLine())!= null){
            for(String word : s.split("[.?!]+")) {
                arrBlackList.add(word);
            }
        }
        int count = 0 ;

        for(int i = 0; i < arr.size();i++){

            for (int j = 0; j < arrBlackList.size(); j++){
                if(arr.get(i).contains(arrBlackList.get(j))){
                    count++;
                    noCensorList.add("\n " + arr.get(i));
                }
            }
        }
        if(count == 0 ){
            System.out.println("Passed censorship!");
        }
        if(count > 0){
            System.out.println("Failed verification : " + count);
            System.out.println(noCensorList);
        }
    }
}
