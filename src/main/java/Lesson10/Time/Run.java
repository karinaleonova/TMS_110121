package Lesson10.Time;

public class Run {

    public static void main(String[] args){
        Time time1 = new Time(6,5,0);
        Time time2 = new Time(5,5,0);
        Time time3 = new Time(3);
        Time time4 = new Time(6);

        Time.printResult(time1,time2);
        Time.printResult(time2,time1);
        Time.printResult(time3,time4);
        Time.printResult(time1,time4);

    }
}
