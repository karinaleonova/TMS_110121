package Lesson10.Robot;

public class ToshibaLeg implements ILeg{
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public void step() {
        System.out.println("Toshiba leg do step");
    }
}
