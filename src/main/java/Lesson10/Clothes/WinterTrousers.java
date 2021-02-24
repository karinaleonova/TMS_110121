package Lesson10.Clothes;

public class WinterTrousers implements Trousers{
    @Override
    public void getDressed() {
        System.out.println("Put on winter trousers");
    }
    @Override
    public void undress() {
        System.out.println("Take off winter trousers");
    }
}