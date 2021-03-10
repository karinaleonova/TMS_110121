package Lesson10.App;

public class LargeApp extends Appliances {
     private int weight;

     public int returnWeight(Object o, int weight){
        System.out.println(o + " - weight is (kg): ");
         return weight;
     }

    public LargeApp(String model, int power) {
        super(model, power);
    }
}
