package Lesson10.Time;

//Создать класс и объекты описывающие промежуток времени. Сам промежуток
//в классе должен задаваться тремя свойствами: секундами, минутами, часами.

public class Time  {
    private int sec;
    private int min;
    private int hour;
    private int allSeconds;
    private Time time;


    //Сделать методы для получения полного количества секунд в объекте
    public static int allSecondsCalculator(Time time){
        int allSec=time.sec + time.min*60 + time.hour*60*60;
         return allSec;
    }
    //         Сделать метод для вывода данных.
    public static void printResult(Time t1, Time t2){
        System.out.println(Compare.compareTo(t1,t2));

    }
    public static int allSecondsValue(Time time){
        int i = (time.allSeconds);
        return i;
    }
//    Создать два конструктора: получающий общее количество секунд, и часы, минуты и секунды
//            по отдельности
    public Time(int sec,int min, int hour){
        this.sec = sec;
        this.min = min;
        this.hour = hour;
    }
    public Time(int allSeconds){
        this.allSeconds = allSeconds;
    }
    public Time getTime() {
        return time;
    }
    public void setTime(Time time) {
        this.time = time;
    }
}