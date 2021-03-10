package Lesson10.Bank;

public class VisaGold extends Visa {
    //class VisaGold extends Visa{
    public VisaGold(String name, int limit) {
        super(name, limit);
    }
    public static String returnBanks(){
        return ", The card can be used in all Banks ";
    }
    @Override
    public void printLimit() {
        System.out.println( toString() + " , I have VisaGold Bank Card" + returnBanks());
    }

    @Override
    public String returnVisaString() {
        return super.returnVisaString();
    }

}
