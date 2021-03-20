package Lesson10.Transport;

public class LandTransport extends Transport {
    private int wheelCount;
    private int fuelConsumption;

    public LandTransport(String transportBrand, int power, int maxSpeed, int weight,int wheelCount,int fuelConsumption) {
        super(transportBrand, power, maxSpeed, weight);
        this.wheelCount=wheelCount;
        this.fuelConsumption=fuelConsumption;
    }

    @Override
    public String toString() {
        return super.toString() +", wheelCount - " + wheelCount +", fuelConsumption -" + fuelConsumption;
    }
}
