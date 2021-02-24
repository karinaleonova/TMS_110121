package Lesson10.Clothes;

public class SummerJacket implements Jacket{
    @Override
    public void getDressed() {
        System.out.println("Put on summer jacket");
    }
    @Override
    public void undress() {
        System.out.println("Take off summer jacket");
    }
}