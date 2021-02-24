package Lesson10.App;

public class Fridge extends LargeApp implements TurnOffOn{


    public Fridge(String model, int power) {
        super(model, power);
    }

    @Override
    public int returnWeight(int weight) {
        System.out.println("Fridge weight is (kg) :");
        return weight;
    }
    @Override
    public void printApp() {
        System.out.println( toString() + " , This is a Fridge , Large Appliance");
    }
}
