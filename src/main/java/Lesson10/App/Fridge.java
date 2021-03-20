package Lesson10.App;

public class Fridge extends LargeApp implements TurnOffOn{
    private boolean canFreez;

    public Fridge(String model, int power,int weight,boolean canFreez) {
        super(model, power,weight);
        this.canFreez=canFreez;
    }

    @Override
    public String appOn() {
        return "Fridge turn on";
    }

    @Override
    public String appOff() {
        return "Fridge turn off";
    }

    @Override
    public String toString() {
        return super.toString() + ", can freeze: " + canFreez;
    }
}
