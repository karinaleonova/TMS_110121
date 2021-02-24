package Lesson10.Clothes;

public class WinterShoes implements Shoes{
    @Override
    public void getDressed() {
        System.out.println("Put on winter shoes");
    }
    @Override
    public void undress() {
        System.out.println("Take off winter shoes");
    }
}