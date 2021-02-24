package Lesson10.Transport;
//
//Для грузового разработать метод который проверит можно ли загрузить в него xxx  груза
//        Метод должен проверять если это кол-во груза помещается в грузовик то выводит
//        в консоль ”Грузовик загружен”, если кол-во груза которое нужно загрузить больше
//        чем то которое может влезть в наш грузовик то выводим
//        “Вам нужен грузовик побольше ”


public class CargoTransport extends LandTransport{
    private int cargoCapacity = 3;

    public void capacity(int cargoCapacity,int cargoAllCapacity){
        if (cargoAllCapacity < cargoCapacity) {
            System.out.println("Need a bigger truck");
        } else {
            System.out.println("Truck loaded");
        }
    }

    @Override
    public String getCarBrand() {
        return "SCANIA";
    }

    @Override
    public int getWeight() {
        return 12000;
    }

    @Override
    public int getPower() {
        return 6;
    }

    @Override
    public int getMaxSpeed() {
        return 210;
    }

    @Override
    public int getWheelCount() {
        return 6;
    }

    @Override
    public int getFuelConsumption() {
        return 135;
    }

    @Override
    public double powerCalculation() {
        return getPower()/0.74;
    }

    @Override
    public void printAllTransportFeature() {
       super.printAllTransportFeature();
        System.out.println(" , cargo capacity - " + cargoCapacity + ", wheels - " + getWheelCount() + ", fuelConsumption - " + getFuelConsumption());
    }
}

