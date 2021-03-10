package Lesson10.Bank;

public class VisaClassic extends Visa {

    public VisaClassic(String name, int limit,int procent) {
        super(name, limit);
    }

    public static String bankProcent(){
        return ", for payment you need to pay - 0.05% of the amount." ;
    }
    @Override
    public void printLimit() {
        System.out.println( toString() + " , I have VisaClassic Bank Card" + bankProcent());
    }

    @Override
    public String returnVisaString() {
        return super.returnVisaString();
    }
}