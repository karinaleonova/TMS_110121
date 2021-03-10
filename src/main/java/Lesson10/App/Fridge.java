package Lesson10.App;

public class Fridge extends LargeApp implements TurnOffOn{


    public Fridge(String model, int power) {
        super(model, power);
    }

    @Override
    public int returnWeight(Object o, int weight) {
        return super.returnWeight(o, weight);
    }

    public static String freeze(){
        return ", Can freeze";
    }

    @Override
    public void printApp() {
        System.out.println( toString() + " , This is a Fridge , Large Appliance" + freeze());
    }
}
