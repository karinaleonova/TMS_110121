package Lesson13.Task30;

//Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
//числа.

import java.util.*;

public class Task30 {

    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();

        for(int i = 0; i < 50; i++) {
            int r= 1 + (int) (Math.random() * 20);
            num.add(r);

        }
        Set<Integer> set = new HashSet<>(num);
        num.clear();
        num.addAll(set);

        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext()){
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
