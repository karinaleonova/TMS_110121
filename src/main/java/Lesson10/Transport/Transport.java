package Lesson10.Transport;

public abstract class Transport {
    private static String transportBrand;
    private static int power;
    private static int maxSpeed;
    private static int weight;

    public Transport(String transportBrand, int power, int maxSpeed, int weight){
        this.transportBrand = transportBrand;
        this.power=power;
        this.maxSpeed=maxSpeed;
        this.weight= weight;
    }

    public int getPower() {return power;}
    public void setPower(int power) { this.power = power; }
    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    public int getWeight() {
        return power;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public  double powerCalculation(){
        double killowatt = getPower()/0.74;
        System.out.println("killowatt- " + killowatt);
        return killowatt;
    }

    @Override
    public String toString() {
        return transportBrand + ", car weight - " + weight
                + "kg , car power - " + power +" h.p  and killowatt - " + powerCalculation()
                +  ", car max speed - " + maxSpeed + ", ";
    }
}