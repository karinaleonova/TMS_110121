package Lesson10.App;

public class SmallApp extends Appliances{
    int length;

    public int returnLength(int length){
        System.out.println("Small Appliances length is (sm) : ");
        return length;
    }

    public SmallApp(String model, int power) {
        super(model, power);
    }
}
