package Lesson13.Task29;
//Создать список оценок учеников с помощью ArrayList, заполнить случайными
//        оценками. Удалить неудовлетворительные оценки из списка.

import java.util.ArrayList;
import java.util.Iterator;

public class Task29 {

    public static void main(String[] args) {
        ArrayList<Integer> grade = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            int r = 1 + (int) (Math.random() * 10);
            grade.add(r);
        }
        System.out.println(grade);

        Iterator<Integer> iterator = grade.iterator();
        Integer max = 3;
        while(iterator.hasNext()){

            if(  iterator.next() <= max ) {
                 iterator.remove();
            }
        }

        System.out.println(grade);
    }
}