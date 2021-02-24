package Lesson10.Star;
//3) Создаем интерфейс IStart.
//        В интерфейсе определяем методы:
//        • предстартовая проверка систем(возвращает true/false)
//        • запуск двигателей(void)
//        • старт(void)


public interface IStar {
    boolean checkSystem();
    void engineStart();
    void start();
}
