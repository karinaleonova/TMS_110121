package Lesson10.Transport;

public abstract class Transport {
    private int power;
    private int maxSpeed;
    private int weight;
    private String carBrand;

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
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
    public String  getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand ) {
        this.carBrand = carBrand;
    }
    public  double powerCalculation(){
        double killowatt = getPower()/0.74;
        System.out.println("killowatt- " + killowatt);
        return killowatt;
    }

    public void printAllTransportFeature(){
        System.out.println("Car brand - " + getCarBrand() + " ,car weight - " + getWeight()
                + "kg , car power - " + getPower() +" h.p  and killowatt - " + powerCalculation()
                +  ", car max speed - " + getMaxSpeed());
    }

    public static void main(String[] args) {
            CargoTransport cargo = new CargoTransport();
            cargo.printAllTransportFeature();
            cargo.capacity(5,6);

            CivilTransport civil = new CivilTransport();
            civil.printAllTransportFeature();
            civil.passengerCapacity(80,150);

            MilitaryTransport military = new MilitaryTransport();
            military.printAllTransportFeature();
            military.checkRocketNum(0);
            military.checkCatapult(false);

            PassengerTransport passenger = new PassengerTransport();
            passenger.printAllTransportFeature();
            passenger.carRideKm(8);

    }
}
