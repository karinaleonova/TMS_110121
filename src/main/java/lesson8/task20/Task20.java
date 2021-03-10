package lesson8.task20;

//Имеется строка с текстом. Вывести текст, составленный из последних букв
//        всех слов.

public class Task20 {
    public static void main(String[] args) {

        String str = "Java is a class based, object oriented programming language";
        System.out.println(str);
        String[] subStr;
        subStr = str.split(" ");

        for(int i = 0; i < subStr.length; i++) {
            System.out.print(subStr[i].charAt(0) + " ");

        }





    }
}
