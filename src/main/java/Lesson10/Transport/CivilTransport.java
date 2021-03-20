package Lesson10.Transport;

//Для грузового разработать метод который проверит можно ли загрузить в него xxx  груза
//        Метод должен проверять если это кол-во груза помещается в грузовик то выводит
//        в консоль ”Грузовик загружен”, если кол-во груза которое нужно загрузить больше
//        чем то которое может влезть в наш грузовик то выводим
//        “Вам нужен грузовик побольше ”.
//        Такой же метод делаем для Гражданских  самолётов, только проверяем вместимость пассажиров.


public class CivilTransport extends AirTransport{
    private int passengerNum ;
    private boolean businessClass;

    public CivilTransport(String transportBrand, int power, int maxSpeed, int weight, int wingspan, int runwayLength,int passengerNum,boolean businessClass) {
        super(transportBrand, power, maxSpeed, weight, wingspan, runwayLength);
        this.passengerNum=passengerNum;
        this.businessClass=businessClass;
    }

    public void passengerCapacity(int allPassNum){
    if ( passengerNum < allPassNum){
        System.out.println("All passenger on board ");
    }
    else System.out.println("Not enought seats for all passenger on the board");
}

    @Override
    public String toString() {
        return super.toString() + ", passengerNum - " + passengerNum + ", businessClass - " + businessClass;
    }
}
