package Lesson10.Bank;

public class VisaGold extends Visa {
    //class VisaGold extends Visa{
    public VisaGold(String name, int limit) {
        super(name, limit);
    }
    @Override
    public void printLimit() {
        System.out.println( toString() + " , I have VisaGold Bank Card");
    }

    @Override
    public String returnVisaString() {
        return super.returnVisaString();
    }
}
