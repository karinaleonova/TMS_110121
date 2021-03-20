package Lesson10.App;

import java.util.Arrays;
import java.util.List;

public class Run {
    public static void main(String[] args) {

        LargeApp fridge = new Fridge("Atlant", 600,67,true);
        SmallApp blender = new Blender("Bosch",120,56,false);

        System.out.println(fridge.toString());
        System.out.println(blender.toString());

        System.out.println(fridge.appOff());
        System.out.println(blender.appOn());

    }
}
