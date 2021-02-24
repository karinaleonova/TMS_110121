package Lesson10.Star;

import java.util.Random;

public class SpaceShip implements IStar{
    @Override
    public boolean checkSystem() {
        int random = 1 + (int) (Math.random() * 10);
        if(random > 4)
            return true;
        else return false;
    }

    @Override
    public void engineStart() {
        System.out.println("SpaceShip : The engines are running. Everything is fine in the system");
    }

    @Override
    public void start() {
        System.out.println("SpaceShip : START! ");
    }

}
