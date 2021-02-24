package Lesson10.Robot;

public class SamsungHead implements IHead{
    private int price;

    public SamsungHead(int price) {
        this.price = price;
    }

    public SamsungHead() {
    }

    @Override
    public void speak() {
        System.out.println("Samsung head speak");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
