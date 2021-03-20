package Lesson10.Transport;
//В конечных классах (Легковой, Грузовой, Военный, Гражданский) разработать метод описание
// который будет возвращать составленную строку с описанием всех характеристик объекта.
// В строку включить ещё один параметр мощность в киловаттах (кВ) . Расчёт мощности в
// киловаттах производится в отдельном методе :
//        1 л.с = 0.74 кВ
//        Для легкового разработать метод который будет принимать время и считать
//        сколько километров проедет машина двигаясь с максимальной скоростью и сколько
//        топлива она израсходует за это время, результат вывести в консоль, расчёт расходуемого
//        топлива вынести в отдельный метод private.
//Результат работы метода должен вывести такую строчку:
//За время (ваше введённое время) ч, автомобиль (марка автомобиля)
//двигаясь с максимальной скоростью (ваша максимальная скорость) км/ч
//проедет (xxx) км  и израсходует (xxx) литров топлива.
//
//Мой результат выглядит так:
//“За время 2,5 часа, автомобиль Audi двигаясь с максимальной скоростью 230 км/ч израсходует 46.0 литров топлива”


import javax.crypto.spec.PSource;

public class PassengerTransport extends LandTransport {
    private String bodyType ;
    private int passengerNum;

    public PassengerTransport(String transportBrand, int power, int maxSpeed, int weight, int wheelCount, int fuelConsumption,String bodyType,int passengerNum) {
        super(transportBrand, power, maxSpeed, weight, wheelCount, fuelConsumption);
        this.bodyType=bodyType;
        this.passengerNum=passengerNum;
    }

    private int useUpFuel(){
        int fuel = getMaxSpeed()/2;
        return fuel;
    }

    public  double carRideKm(double time){
       double carKm = time * getMaxSpeed();
       double fuel = useUpFuel()/time;
        System.out.println("During "+ time +" hours, car moving at a maximum speed of "
                + getMaxSpeed() +" km / h will consume "+ fuel+" liters of fuel");
       return carKm;
    }

    @Override
    public String toString() {
        return super.toString() + "bodyType - " + bodyType + ", passengerNum - " + passengerNum;
    }
}
