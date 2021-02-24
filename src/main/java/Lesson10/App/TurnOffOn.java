package Lesson10.App;

public interface TurnOffOn {



    static boolean appOn(Object o){
        System.out.println("If turn on - true, turn on - false:");
        return true;
    }

     static boolean appOff(Object o){
         System.out.println("If turn on - true, turn on - false:");
        return false;
    }
}
