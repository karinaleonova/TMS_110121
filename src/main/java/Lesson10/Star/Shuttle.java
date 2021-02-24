package Lesson10.Star;
//        Создаем класс Шатл.
//        Шатл реализует интерфейс IStart.
//        • В методе предстартовой проверки генерируем случайное число в диапазоне от 0 до 10.
//        Если сгенерированное число больше 3-х то проверка прошла успешно. Если нет не успешно.
//        • В методе запуска двигателей выводим строку в консоль «Двигатели Шатла запущены. Все системы в норме.»
//        • В методе старт выводим строку в консоль. «Старт Шатла»
//        По аналогии создайте еще пару классов реализующих интерфейс Istart(например SpaceX).
//        Для предстартовой проверки можете придумать свою логику, главное, что бы метод возвращал true
//        либо false в зависимости от того прошла ли она успешно.
//        Запустите в космос созданные вами космические корабли используя созданный вами космодром и его метод старт.

import java.util.Random;

public class Shuttle implements IStar{

    @Override
    public boolean checkSystem() {
      int random = 1 + (int) (Math.random() * 10);
        if(random > 3)
        return true;

        else return false;

    }

    @Override
    public void engineStart() {
        System.out.println("Shuttle : The engines are running. Everything is fine in the system");
    }

    @Override
    public void start() {
        System.out.println("Shuttle : START! ");
    }
}
