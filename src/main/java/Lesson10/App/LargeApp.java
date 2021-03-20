package Lesson10.App;

public class LargeApp extends Appliances implements TurnOffOn{
     private int weight;


    public LargeApp(String model, int power,int weight) {
        super(model, power);
        this.weight=weight;
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
        return super.toString() + " - weight is (kg): " + weight;
    }
}
