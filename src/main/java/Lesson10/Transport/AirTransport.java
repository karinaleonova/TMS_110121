package Lesson10.Transport;

public class AirTransport extends Transport{
    private int wingspan;
    private int runwayLength;

    public AirTransport(String transportBrand, int power, int maxSpeed, int weight,int wingspan,int runwayLength) {
        super(transportBrand, power, maxSpeed, weight);
        this.wingspan=wingspan;
        this.runwayLength=runwayLength;
    }

    @Override
    public String toString() {
        return super.toString() + "wingspan -" + wingspan + ", runwayLength - " + runwayLength;
    }
}
