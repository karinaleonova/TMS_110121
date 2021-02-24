package Lesson10.Transport;

//Для грузового разработать метод который проверит можно ли загрузить в него xxx  груза
//        Метод должен проверять если это кол-во груза помещается в грузовик то выводит
//        в консоль ”Грузовик загружен”, если кол-во груза которое нужно загрузить больше
//        чем то которое может влезть в наш грузовик то выводим
//        “Вам нужен грузовик побольше ”.
//        Такой же метод делаем для Гражданских  самолётов, только проверяем вместимость пассажиров.


public class CivilTransport extends AirTransport{
    private int passengerNum = 200;
    private boolean businessClass;

public void passengerCapacity(int passNum, int allPassNum){
    if ( passNum < allPassNum){
        System.out.println("All passenger on board ");
    }
    else System.out.println("Not enought seats for all passenger on the board");
}

    @Override
    public String getCarBrand() {
        return "Airbus A220";
    }

    @Override
    public int getPower() {
        return 10;
    }

    @Override
    public int getMaxSpeed() {
        return 900;
    }

    @Override
    public int getWeight() {
        return 27000;
    }

    @Override
    public int getWingspan() {
        return 80;
    }

    @Override
    public int getRunwayLength() {
        return 3300;
    }
    @Override
    public double powerCalculation() {
        return getPower()/0.74;
    }
    @Override
    public void printAllTransportFeature() {
    super.printAllTransportFeature();
        System.out.println("wingspan - " + getWingspan()+ ", runway length - "
                + getRunwayLength() + ", passenger num - " + passengerNum + ", have business class - " + businessClass);
    }
}
