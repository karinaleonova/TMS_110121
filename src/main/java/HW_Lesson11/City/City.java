package HW_Lesson11.City;


//Создать класс City с внутренним классом, с помощью объектов которого можно хранить информацию
//о проспектах, улицах, площадях.

public class City {
    private String cityName;
    private String cityLocation;


    public City(String cityName,String cityLocation){
        this.cityName = cityName;
        this.cityLocation = cityLocation;

    }
    public void returnCityInfo() {
        System.out.println(cityName +" ,"+ cityLocation +".");
    }

    public class EuropeanUnion{

        public void inEurope(){
            System.out.println(" - this city in the European Union");
        }
        public void itIsNotEurope(){
            System.out.println(" - this city is not in European Union");
        }
    }
    public class CityPopulation{
        private int population;

        public int getPopulation() {
            return population;
        }

        public void setPopulation(int population) {
            this.population = population;
        }
        public CityPopulation(int population){
            this.population = population;
        }

        public boolean moreMillionPopulation(){
            if(this.population > 1000000){
                System.out.println("The population of the city is more than a million!!!");
                return true;
            }

            else System.out.println("It is a small population city");
            return false;
        }
    }
}