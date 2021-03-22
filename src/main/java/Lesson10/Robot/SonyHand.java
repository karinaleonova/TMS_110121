package Lesson10.Robot;

public class SonyHand implements IHand{
    private int price;

    public SonyHand(int price) {
        this.price = price;
    }

    public SonyHand() {
    }

    @Override
    public void upHand() {
        System.out.println("Sony hand up");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
