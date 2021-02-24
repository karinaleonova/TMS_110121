package Lesson10.Star;

import java.util.Random;

public class SpaceXL implements IStar{
    @Override
    public boolean checkSystem() {
        int random = 1 + (int) (Math.random() * 10);
        if(random > 5)
            return true;
        else return false;
    }

    @Override
    public void engineStart() {
        System.out.println("SpaceXL : The engines are running. Everything is fine in the system");
    }

    @Override
    public void start() {
        System.out.println("SpaceXL : START! ");
    }
}
