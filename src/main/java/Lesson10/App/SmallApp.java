package Lesson10.App;

public class SmallApp extends Appliances{
    private int length;

    public int returnLength(int length){
        System.out.println(getModel() + " - length is (sm) : ");
        return length;
    }

    public SmallApp(String model, int power) {
        super(model, power);
    }
}
