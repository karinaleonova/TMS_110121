package Lesson10.Bank;

public class Visa extends BankCard{
    private int clientNum;

    public Visa(String name, int limit, int clientNum) {
        super(name, limit);
        this.clientNum = clientNum;
    }

    @Override
    public String toString() {
        return super.toString() + ", client number - VIS" + clientNum + ", ";
    }
}
