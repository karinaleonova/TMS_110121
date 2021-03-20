package Lesson10.Transport;
//
//Для грузового разработать метод который проверит можно ли загрузить в него xxx  груза
//        Метод должен проверять если это кол-во груза помещается в грузовик то выводит
//        в консоль ”Грузовик загружен”, если кол-во груза которое нужно загрузить больше
//        чем то которое может влезть в наш грузовик то выводим
//        “Вам нужен грузовик побольше ”


public class CargoTransport extends LandTransport{
    private int cargoCapacity;

    public CargoTransport(String transportBrand, int power, int maxSpeed, int weight, int wheelCount, int fuelConsumption,int cargoCapacity) {
        super(transportBrand, power, maxSpeed, weight, wheelCount, fuelConsumption);
        this.cargoCapacity=cargoCapacity;
    }


    public void capacity(int cargoCapacity,int cargoAllCapacity){
        if (cargoAllCapacity < cargoCapacity) {
            System.out.println("Need a bigger truck");
        } else {
            System.out.println("Truck loaded");
        }
    }

    @Override
    public String toString() {
        return super.toString() +"cargoCapacity - " + cargoCapacity;
    }

}

