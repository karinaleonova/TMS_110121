package Lesson10.Clothes;

public class SummerShoes implements Shoes{
    @Override
    public void getDressed() {
        System.out.println("Put on summer shoes");
    }
    @Override
    public void undress() {
        System.out.println("Take off summer shoes");
    }
}
