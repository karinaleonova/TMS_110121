package Lesson10.Bank;

public class VisaClassic extends Visa {
    private double bankProcent;


    public VisaClassic(String name, int limit, int clientNum,double bankProcent) {
        super(name, limit, clientNum);
        this.bankProcent=bankProcent;
    }

    public String returnCardOptions(){
        return "the card is used without interest only for visa bank";
    }

    @Override
    public String toString() {
        return super.toString() + " Bank procent - " + bankProcent + "% , " + returnCardOptions();
    }
}