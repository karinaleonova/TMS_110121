package Lesson10.Clothes;

public class SummerTrousers implements Trousers{
    @Override
    public void getDressed() {
        System.out.println("Put on summer trousers");
    }
    @Override
    public void undress() {
        System.out.println("Take off summer trousers");
    }
}