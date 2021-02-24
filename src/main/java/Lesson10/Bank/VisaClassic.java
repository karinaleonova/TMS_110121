package Lesson10.Bank;

public class VisaClassic extends Visa {

    public VisaClassic(String name, int limit) {
        super(name, limit);
    }
    @Override
    public void printLimit() {
        System.out.println( toString() + " , I have VisaClassic Bank Card");
    }

    @Override
    public String returnVisaString() {
        return super.returnVisaString();
    }
}
