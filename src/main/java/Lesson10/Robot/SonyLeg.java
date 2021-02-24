package Lesson10.Robot;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void step() {
        System.out.println("Sony leg do step");
    }
}
