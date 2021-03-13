package lesson15.dopTask1;

//1)В исходном файле находятся слова, каждое слово на новой стороке. После
//        запуска программы должен создать файл, который будет содержать в себе
//        только полиндромы


import java.io.*;

public class Task1 {
    public static void main(String[] args) throws IOException {
        String fileName = "src/main/java/Lesson15/dopTask1/text1.txt";

        File file = new File(fileName);
        BufferedReader reader = new BufferedReader(new FileReader(file));

         DataOutputStream a;
        try {
            a = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/main/java/Lesson15/dopTask1/newText1.txt")));
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        String i;
        while((i = reader.readLine())!= null){
            if(i.equals(new StringBuilder(i).reverse().toString())){
                a.writeUTF(i);
            }
        }
        a.close();
        reader.close();
    }
}
