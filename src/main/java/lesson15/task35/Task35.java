package lesson15.task35;

//Записать в двоичный файл 20 случайных чисел. Прочитать записанный файл,
//        распечатать числа и их среднее арифметическое.

import java.io.*;

public class Task35 {

    public static void main(String[] args) throws Exception {

        String fileName = "src/main/java/Lesson15/Task35/st.txt";
        File file = new File(fileName);
        double sumCount = 0;

        DataOutputStream outPut;
        DataInputStream inPut;
        try {
            outPut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(file)));
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
            return;
        }
        System.out.print("Write : ");
        for (int i = 0; i < 20; i++) {
            int ran = 1 + (int) (Math.random() * 100);
            outPut.writeInt(ran);
            System.out.print(ran + " ");
            sumCount += ran;
        }
        outPut.close();

        System.out.println();

        try {
            inPut = new DataInputStream(new BufferedInputStream(new FileInputStream(file)));
        } catch (Exception e) {
            System.out.print("File not found");
            return;
        }
        int res = inPut.readInt();
        System.out.print("Read :  ");
        while (true) {
            System.out.print(res + " ");
            try {
                res = inPut.readInt();
            } catch (EOFException e) {
                break;
            }
            finally {
                if (inPut == null) {
                    break;
                }
            }
        }
        System.out.println("\n Average : " + sumCount / 20);
    }
}