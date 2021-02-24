package Lesson10.Bank;

import java.util.Arrays;
import java.util.List;

public class Run {
        public static void main(String[] args) {

        Visa visaC = new VisaClassic("Jill", 1500);
        Visa visaG = new VisaGold("Eric", 30000);
            System.out.println(visaC.returnVisaString());

        List<BankCard> discotheque = Arrays.asList(visaC,visaG);
        for (BankCard d : discotheque) {
            d.printLimit();
        }
    }
}
