package Lesson10.App;

public class Blender extends SmallApp implements TurnOffOn {
    private boolean canMix;

    public Blender(String model, int power,int length,boolean canMix) {
        super(model, power,length);
        this.canMix=canMix;
    }

    @Override
    public String appOff() {
        return "Blender turn off";
    }

    @Override
    public String appOn() {
        return "Blender turn on";
    }
    @Override
    public String toString() {
        return super.toString() + ", can mix - " + canMix;
    }
}
