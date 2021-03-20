package Lesson10.Bank;

import java.util.Arrays;
import java.util.List;

public class Run {
        public static void main(String[] args) {

        Visa visaG = new VisaGold("Eric", 30000,6666,7 );
            Visa visaC = new VisaClassic("Jill", 1500,7800,1.1);

            System.out.println(visaC.toString());
            System.out.println(visaG.toString());

        }
    }

