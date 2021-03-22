package Lesson10.Robot;

public class SonyHead implements IHead{
    private int price;

    public SonyHead(int price) {
        this.price = price;
    }

    public SonyHead() {
    }

    @Override
    public void speak() {
        System.out.println("Sony head speak");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
