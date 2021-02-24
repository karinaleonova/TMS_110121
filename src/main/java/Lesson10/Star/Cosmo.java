package Lesson10.Star;
//Создаем класс Космодром.
//        В классе создаем метод:
//        • запуск
//        Метод запуск принимает объект типа IStart.
//        В методе первым делом осуществляем предстартовую проверку переданного объекта,
//        если она провалилась(метод вернул false) выводим сообщение «Предстартовая проверка
//        провалена». Если проверка прошла успешно, то производим запуск двигателей(вызываем метод запуска двигателя).
//        После этого производиться обратный отсчет (10 ..... 1).
//        После обратного отсчета вызываем метод старт переданного объекта.

import Lesson10.Robot.SonyHand;

public class Cosmo {
    public static void launch (IStar iStar) throws InterruptedException {
        if ( iStar.checkSystem()==false){
            System.out.println(" Check failed!");
        }
        else if (iStar.checkSystem() == true){
            iStar.engineStart();
            for(int i = 10; i > 0; i--){
                System.out.println(i);
                Thread.sleep(500);
            }
            iStar.start();
        }
    }

}
