package Lesson10;
//
//Создать класс и объекты описывающие Банкомат. Набор купюр находящихся в
//        банкомате должен задаваться тремя свойствами: количеством купюр номиналом 20
//        50 100. Сделать методы для добавления денег в банкомат. Сделать функцию
//        снимающую деньги. На вход передается сумма денег. На выход – булевское
//        значение (операция удалась или нет). При снятии денег функция должна
//        рапечатывать каким количеством купюр какого номинала выдается сумма. Создать
//        конструктор с тремя параметрами – количеством купюр.

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.ArrayList;

public class Atm {
    private static int n20;
    private static int n50;
    private static int n100;

    public Atm(int n100, int n50, int n20) {
        this.n20 = n20;
        this.n50 = n50;
        this.n100 = n100;
    }

    public static void main(String[] args) {

        Atm atm = new Atm(1, 1, 1);    //100, 50, 20
        System.out.println("ATM dispenses only bills of 20, 50, 100!");
        System.out.println(withdrawTrueOrFalse(120,addMoneyAtm()));
        withdrawCash(70);

    }
    public static int addMoneyAtm() {

        int atmAllSum = (n20) * 20 + (n50) * 50 + (n100 * 100);
        return atmAllSum;
    }

    public static boolean withdrawTrueOrFalse(int amountToWithdraw, int atmAllSum) {
        if (amountToWithdraw > atmAllSum) return false;
        else return true;
    }

    public static void withdrawCash(int amountToWithdraw) {
        int[] amountOfBanknotes = {0, 0, 0};   // 0-100,1-50,2-20

        System.out.println("Cash out - " + amountToWithdraw);

        while (n100 > 0 && amountToWithdraw >= 100) {
            amountToWithdraw -= 100;
            n100--;
            amountOfBanknotes[0]++;
        }
        System.out.println("left to withdraw " + amountToWithdraw + " || 100 banknotes " + amountOfBanknotes[0]);

        while (n50 > 0 && amountToWithdraw >= 50) {
            if (amountToWithdraw >= 50 && amountToWithdraw < 100 && amountToWithdraw % 20 == 0) break;
            amountToWithdraw -= 50;
            n50--;
            amountOfBanknotes[1]++;
        }
        System.out.println("left to withdraw " + amountToWithdraw + " || 50 banknotes " + amountOfBanknotes[1]);

        while (n20 != 0 && amountToWithdraw >= 20) {
            amountToWithdraw -= 20;
            n20--;
            amountOfBanknotes[2]++;
        }
        System.out.println("left to withdraw " + amountToWithdraw + " || 20 banknotes " + amountOfBanknotes[2]);

    }
}