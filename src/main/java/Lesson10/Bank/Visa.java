package Lesson10.Bank;

public class Visa extends BankCard{


    public Visa(String name, int limit) {
        super(name, limit);
    }
    @Override
    public void printLimit() {
        System.out.println( toString() + " , I have Visa Bank Card");
    }

    public String returnVisaString(){
        return "Visa is the world's second-largest card payment organization. ";
    }
}
