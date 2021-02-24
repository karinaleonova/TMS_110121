package Lesson10.Clothes;

public class WinterJacket implements Jacket{
    @Override
    public void getDressed() {
        System.out.println("Put on winter jacket  ");
    }
    @Override
    public void undress() {
        System.out.println("Take off winter jacket ");
    }
}
