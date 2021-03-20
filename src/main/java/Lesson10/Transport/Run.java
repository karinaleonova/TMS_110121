package Lesson10.Transport;

public class Run {

    public static void main(String[] args) {
        CargoTransport cargo = new CargoTransport("Cargo",123,210,1200,6,89,6);
        System.out.println(cargo.toString());
        cargo.capacity(5,6);

        CivilTransport civil = new CivilTransport("Civil",120,240,800,780,1280,190,true);
        System.out.println(civil.toString());
        civil.passengerCapacity(150);

        MilitaryTransport military = new MilitaryTransport("Military",60,240,1000,670,8900,1,true);
        System.out.println(military.toString());

        PassengerTransport passenger = new PassengerTransport("bmw",139,230,980,4,80,"passat",8);
        System.out.println(passenger.toString());
        passenger.carRideKm(8);

    }
}
