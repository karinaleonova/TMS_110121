package Lesson10.App;

//Создать иерархию классов, описывающих бытовую технику. Создать несколько
//        объектов описанных классов, часть из них включить в розетку.
//        Иерархия должна иметь хотя бы три уровня.

public  abstract class Appliances implements TurnOffOn{
    private final String model;
    private final int power;


    public Appliances(String model, int power) {
        this.model = model;
        this.power = power;
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return "Model : " + model + ", appliances power is " + power + ", " ;
    }

}