package Lesson10.Bank;

import java.io.PrintStream;

public class VisaClassic extends Visa {

    public VisaClassic(String name, int limit) {
        super(name, limit);

    }
    public static double returnProcent(){
        return 5.7;
    }

    @Override
    public void printLimit() {
        System.out.println( toString() + " , I have VisaClassic Bank Card, bank procent " + returnProcent()+ "%");
    }

    @Override
    public String returnVisaString() {
        return super.returnVisaString();
    }

}