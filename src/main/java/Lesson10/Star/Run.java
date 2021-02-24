package Lesson10.Star;

public class Run {
    public static void main(String[] args) throws InterruptedException {
        Shuttle shuttle = new Shuttle();
        SpaceShip spaceShip = new SpaceShip();
        SpaceXL spaceXL = new SpaceXL();


        Cosmo.launch(shuttle);
        Cosmo.launch(spaceShip);
    }
}
