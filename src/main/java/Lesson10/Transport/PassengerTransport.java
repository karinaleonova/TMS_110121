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
    private String bodyType = "Pickup";
    private int passengerNum = 8;



    @Override
    public String getCarBrand() {
        return "Peugeot";
    }

    @Override
    public int getWeight() {
        return 5440;
    }

    @Override
    public int getPower() {
        return 8;
    }

    @Override
    public int getMaxSpeed() {
        return 260;
    }

    @Override
    public int getWheelCount() {
        return 4;
    }

    @Override
    public int getFuelConsumption() {
        return 140;
    }
    @Override
    public double powerCalculation() {
        return getPower()/0.74;
    }
    private int useUpFuel(){
        int fuel = getMaxSpeed()/2;
        return fuel;
    }

    public  double carRideKm(double time){
       double carKm = time * getMaxSpeed();
       double fuel = useUpFuel()/time;
        System.out.println("During "+ time +" hours, an "+ getCarBrand() + " car moving at a maximum speed of "
                + getMaxSpeed() +" km / h will consume "+ fuel+" liters of fuel");
       return carKm;
    }

    @Override
    public void printAllTransportFeature() {
        System.out.println("Car brand - " + getCarBrand() + " ,car weight - " + getWeight()
                + "kg , car power - " + getPower() +"h.p  and killowatt - " + powerCalculation()+ ", car max speed - "
                + getMaxSpeed() + ", wheels num - " + getWheelCount() + ", fuel consumption - "
                + getFuelConsumption() + ", car capacity - " + " , car body - " + bodyType +
                ", car passenger num - "+ passengerNum);
    }
}
