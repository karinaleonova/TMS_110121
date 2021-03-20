package Lesson10.Bank;

public class VisaGold extends Visa {
    private int cardCount;

    public VisaGold(String name, int limit, int clientNum,int cardCount) {
        super(name, limit, clientNum);
        this.cardCount=cardCount;
    }

    public String returnBanks(){
        return ", The card can be used in all Banks ";
    }

    @Override
    public String toString() {
        return super.toString() + " Your card count is  - " + cardCount + returnBanks();
    }
}
