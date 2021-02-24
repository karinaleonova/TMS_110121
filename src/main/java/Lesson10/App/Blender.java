package Lesson10.App;

public class Blender extends SmallApp implements TurnOffOn {


    public Blender(String model, int power) {
        super(model, power);
    }
    @Override
    public void printApp() {
        System.out.println( toString() + " , This is a Blender , Small Appliance");
    }

    @Override
    public int returnLength(int length) {
        System.out.println("Blender length is (sm) :");
        return length;
    }
}
