package Lesson10.Robot;

public class ToshibaHead implements IHead{
    private int price;

    public ToshibaHead(int price) {
        this.price = price;
    }

    public ToshibaHead() {
    }

    @Override
    public void speak() {
        System.out.println("Toshiba head speak");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
