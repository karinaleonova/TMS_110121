package Lesson10.App;

public class LargeApp extends Appliances {
     int weight;

     public int returnWeight(int weight){
        System.out.println("Large Appliances weight is (kg): ");
         return weight;
     }

    public LargeApp(String model, int power) {
        super(model, power);
    }
}
