package Lesson10.App;

public class Blender extends SmallApp implements TurnOffOn {

    public Blender(String model, int power) {
        super(model, power);
    }

    public static String mixProduct(){
        return ", Can mix products";
    }
    @Override
    public void printApp() {
        System.out.println( toString() + " , This is a Blender , Small Appliance" + mixProduct());
    }

    @Override
    public int returnLength(int length) {
        return super.returnLength(length);
    }
}
