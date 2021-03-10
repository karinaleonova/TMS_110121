package Lesson10.App;

public class SmallApp extends Appliances{
    private int length;

    public int returnLength(Object o, int length){
        System.out.println(o + " - length is (sm) : ");
        return length;
    }

    public SmallApp(String model, int power) {
        super(model, power);
    }
}
