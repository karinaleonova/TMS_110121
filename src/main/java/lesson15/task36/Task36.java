package lesson15.task36;

//Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги
//        должны быть распечатаны отдельно.

import java.io.File;

public class Task36 {
    public static void main(String[] args) {

        File myFiles = new File("/Users/..");
        printMyFiles(myFiles);

    }
    public static  void printMyFiles(File files){
        if(files.isDirectory())
        {
            System.out.println("Folder : ");
            for(File item : files.listFiles()){
                if(item.isDirectory()){
                    System.out.println(item.getName() + "\t");
                }
            }
            System.out.println("******************");
            System.out.println("File : ");
            for(File item : files.listFiles()){
                if(!item.isDirectory()){
                    System.out.println(item.getName() + "\t");
                }
            }
        }
    }
}
