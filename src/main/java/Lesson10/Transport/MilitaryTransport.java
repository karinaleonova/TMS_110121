package Lesson10.Transport;

//Для Военных самолётов делаем метод выстрел, проверяем если кол-во ракет не равно 0
// то выводим на консоль “ Ракета пошла…”, если 0 то
//        “Боеприпасы отсутствуют”.
//        А так же метод катапультирование, который проверит если наличие системы
//        катапультирования true, то выводим “Катапультирование прошло успешно”,
//        если false, то “У вас нет такой системы ”


public class MilitaryTransport extends AirTransport{
    private int rocketNum;
    private boolean catapult;

    public MilitaryTransport(String transportBrand, int power, int maxSpeed, int weight, int wingspan, int runwayLength,int rocketNum,boolean catapult) {
        super(transportBrand, power, maxSpeed, weight, wingspan, runwayLength);
        this.rocketNum=rocketNum;
        this.catapult=catapult;
    }

    public String checkRocketNum(){
        if(rocketNum > 0  ){
            return "Launch a rocket";
        }
        else return "No ammunition";
    }

    public String checkCatapult(){
        if ( catapult ) {
            return "Bailout was successful";
        }
        else return "There is not such system";
    }

    @Override
    public String toString() {
        return super.toString() +", rocketNum - " + rocketNum + ", catapult- " + checkCatapult() + ", "+checkRocketNum();
    }
}
