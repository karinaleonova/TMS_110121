package Lesson10.App;

public class LargeApp extends Appliances {
     private int weight;

     public int returnWeight(int weight){

        System.out.println(getModel() + " - weight is (kg): ");
         return weight;
     }

    public LargeApp(String model, int power) {
        super(model, power);
    }
}
