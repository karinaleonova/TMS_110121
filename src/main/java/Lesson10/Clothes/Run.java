package Lesson10.Clothes;

public class Run {
    public static void main(String[] args) {

        SummerJacket summerJacket = new SummerJacket();
        SummerShoes summerShoes = new SummerShoes();
        SummerTrousers summerTrousers = new SummerTrousers();

        WinterJacket winterJacket = new WinterJacket();
        WinterShoes winterShoes = new WinterShoes();
        WinterTrousers winterTrousers = new WinterTrousers();

        Person rob = new Person("Rob",summerJacket,summerTrousers,winterShoes );
        Person tom = new Person("Tom",winterJacket,winterTrousers,summerShoes);

        tom.getDressedAll();
        rob.undressAll();
    }
}