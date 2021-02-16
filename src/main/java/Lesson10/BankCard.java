package Lesson10;

//Создать иерархию классов, описывающих банковские карточки.
//        Иерархия должна иметь хотя бы три уровня.

import java.util.Arrays;
import java.util.List;

public class BankCard {
    private final String client;
    private final int limit;


    public BankCard(String name ,int limit) {
        this.client = name;
        this.limit = limit;
    }
    public void printLimit(){
        System.out.println(toString() + " , Default Bank card ");
    }
    @Override
    public String toString() {
        return "My name is " + client + ", my cart limit is  " + limit ;
    }
}

class Visa extends BankCard{

    public Visa(String name, int limit) {
        super(name, limit);
    }

    @Override
    public void printLimit() {
        System.out.println( toString() + " , I have Visa Bank Card");
    }
}
class VisaClassic extends Visa{
    public VisaClassic(String name, int limit) {
        super(name, limit);
    }

    @Override
    public void printLimit() {
        System.out.println( toString() + " , I have VisaClassic Bank Card");
    }
}
class VisaGold extends Visa{
    public VisaGold(String name, int limit) {
        super(name, limit);
    }

    @Override
    public void printLimit() {
        System.out.println( toString() + " , I have VisaGold Bank Card");
    }
}


class Main {
    public static void main(String[] args) {


        BankCard visa = new Visa("Tom", 1000);
        Visa visaC = new VisaClassic("Jill", 1500);
        Visa visaG = new VisaGold("Eric", 30000);

        List<BankCard> discotheque = Arrays.asList( visa, visaC,visaG);
        for (BankCard d : discotheque) {
            d.printLimit();
        }
    }}




