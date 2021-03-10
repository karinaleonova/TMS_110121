package Lesson10.App;

import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {

        LargeApp fridge = new Fridge("Atlant", 600);
        SmallApp blender = new Blender("Bosch",120);
        List<Appliances> discotheque = Arrays.asList(fridge,blender);

        for (Appliances d : discotheque) {
            d.printApp();
        }
        System.out.println(fridge.returnWeight(fridge.getModel(),678));
        System.out.println(blender.returnLength(blender.getModel(),15));
        System.out.println(TurnOffOn.appOn(blender.getModel()));
        System.out.println(TurnOffOn.appOff(fridge.getModel()));
    }
}
