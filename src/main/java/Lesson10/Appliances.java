package Lesson10;

//Создать иерархию классов, описывающих бытовую технику. Создать несколько
//        объектов описанных классов, часть из них включить в розетку.
//        Иерархия должна иметь хотя бы три уровня.

import java.util.Arrays;
import java.util.List;

public  class Appliances {
    private final String model;
    private final int power;
    public static void main(String[] args) {



        LargeAppliances fridge = new Fridge("Atlant", 600);
        SmallAppliances blender = new Blender("Bosch",120);


        List<Appliances> discotheque = Arrays.asList(fridge,blender);
        for (Appliances d : discotheque) {
            d.printApp();
        }
        System.out.println(TurnON.appOn(blender));
        System.out.println(TurnOff.appOff(blender));
    }


    public Appliances(String model ,int power) {
        this.model = model;
        this.power = power;
    }
    public void printApp(){
        System.out.println(toString() + " , Appliances ");
    }
    @Override
    public String toString() {
        return "Model : " + model + ", appliances power is " + power ;
    }
}
interface TurnON{
    public static boolean appOn(Object o){

        return true;
    }
}
interface TurnOff{
    public static boolean appOff(Object o){

        return false;
    }
}

class LargeAppliances extends Appliances{


    public LargeAppliances(String model, int power) {
        super(model, power);
    }
}
class SmallAppliances extends Appliances{
    public SmallAppliances(String model, int power) {
        super(model, power);
    }
}
class Fridge extends LargeAppliances implements TurnON, TurnOff{
    public Fridge(String model, int power) {
        super(model, power);
    }

    @Override
    public void printApp() {
        System.out.println( toString() + " , This is a Fridge , Large Appliance");
    }
}
class Blender extends SmallAppliances implements TurnON , TurnOff{
    public Blender(String model, int power) {
        super(model, power);
    }

    @Override
    public void printApp() {
        System.out.println( toString() + " , This is a Blender , Small Appliance");
    }
}
