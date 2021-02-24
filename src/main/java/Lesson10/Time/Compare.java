package Lesson10.Time;

//    сравнения  двух объектов (метод должен работать аналогично compareTo в строках).
public class Compare {

    public static boolean compareTo(Time time1, Time time2) {
        if(Time.allSecondsCalculator(time1) > Time.allSecondsCalculator(time2)){
            return true;
        }
         else if(Time.allSecondsValue(time1) > Time.allSecondsValue(time2)){
            return true;
        }
        else return false;
    }
}
