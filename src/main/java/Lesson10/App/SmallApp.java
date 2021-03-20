package Lesson10.App;

public class SmallApp extends Appliances implements TurnOffOn{
    private int length;


    public SmallApp(String model, int power,int length) {
        super(model, power);
        this.length= length;
    }

    @Override
    public String appOn() {
        return "Turn on";
    }

    @Override
    public String appOff() {
        return "Turn off";
    }
    @Override
    public String toString() {
        return super.toString() + " - length is (sm): " + length;
    }
}
