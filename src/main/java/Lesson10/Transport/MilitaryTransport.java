package Lesson10.Transport;

//Для Военных самолётов делаем метод выстрел, проверяем если кол-во ракет не равно 0
// то выводим на консоль “ Ракета пошла…”, если 0 то
//        “Боеприпасы отсутствуют”.
//        А так же метод катапультирование, который проверит если наличие системы
//        катапультирования true, то выводим “Катапультирование прошло успешно”,
//        если false, то “У вас нет такой системы ”


public class MilitaryTransport extends AirTransport{
    private int rocketNum = 6;
    private boolean catapult;

    public void checkRocketNum(int rocketNum){
        if(rocketNum > 0  ){
            System.out.println("Launch a rocket");
        }
        else System.out.println("No ammunition");
    }

    public void checkCatapult(boolean b){
        if ( b ) System.out.println("Bailout was successful");
        else System.out.println("There is not such system");
    }


    @Override
    public String getCarBrand() {
        return "Dassault Rafale";
    }

    @Override
    public int getPower() {
        return 8;
    }

    @Override
    public int getMaxSpeed() {
        return 2130;
    }

    @Override
    public int getWeight() {
        return 9979;
    }

    @Override
    public int getWingspan() {
        return 11;
    }

    @Override
    public int getRunwayLength() {
        return 800;
    }
    @Override
    public double powerCalculation() {
        return getPower()/0.74;
    }
    @Override
    public void printAllTransportFeature() {
        System.out.println("Car brand - " + getCarBrand() + " ,car weight - " + getWeight()
                + "kg , car power - " + getPower() + " h.p  and killowatt - " + powerCalculation()+
                " , car max speed - " + getMaxSpeed()+ " , wingspan - " + getWingspan()+ ", runway length - "
                + getRunwayLength() + ", rocket num - " + rocketNum + ", Have catapult - " + catapult);
    }
}
