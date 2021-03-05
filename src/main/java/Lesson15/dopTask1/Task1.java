package Lesson15.dopTask1;

//1)В исходном файле находятся слова, каждое слово на новой стороке. После
//        запуска программы должен создать файл, который будет содержать в себе
//        только полиндромы


import java.io.*;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String fileName = "src/main/java/Lesson15/dopTask1/text1.txt";

        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));
        ArrayList<String> array = new ArrayList<>();
        ArrayList<String> newArray = new ArrayList<>();
        ArrayList<String> newString = new ArrayList<>();

        String i;
        while((i = reader.readLine())!= null){
            array.add(i);

        }
        for(int ii =0; ii < array.size(); ii++){
           newArray.add(new StringBuilder(array.get(ii)).reverse().toString());

           if(newArray.get(ii).equals(array.get(ii))){
               newString.add(array.get(ii));
           }
        }

        DataOutputStream a;
        try {
            a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/Lesson15/dopTask1/newText1.txt")));
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        for(String s : newString){
            a.writeUTF(s);
        }
        a.close();
        reader.close();
    }
}
