package Lesson10.App;

public interface TurnOffOn {

    static String appOn(Object o){
        return o + " - Is turn on";
    }

     static String appOff(Object o){
        return o + " - Is turn off";
    }
}
