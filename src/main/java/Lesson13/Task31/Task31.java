package Lesson13.Task31;

//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//оценками. Найти самую высокую оценку с использованием итератора.

import java.util.ArrayList;
import java.util.Iterator;

public class Task31 {
    public static void main(String[] args) {
        ArrayList<Integer> grade = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            int r= 1 + (int) (Math.random() * 10);
            grade.add(r);
        }
        System.out.println(grade);

        Iterator<Integer> iterator = grade.iterator();
        Integer max = 1;
        while(iterator.hasNext()){

            if(  iterator.next() >= max && iterator.hasNext()) {
                max = iterator.next();
            }
        }
        System.out.println("max - " + max);

    }
}