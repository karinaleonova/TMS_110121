package HW_Lesson11.City;


//Создать класс City с внутренним классом, с помощью объектов которого можно хранить информацию
//о проспектах, улицах, площадях.

public class City {
    private String cityName;

    public City() {
        cityName = "Rotterdam";
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    class Information {
        private String street;
        private String parCity;
        private int buildYear;
        private long population;

        Information() {
            this.street = "Vondelweg";
            this.parCity = "Center";
            this.buildYear = 1956;
            this.population = 67000;
        }

        Information(String street, String parCity, int buildYear, long population) {
            setStreet(street);
            setParCity(parCity);
            setBuildYear(buildYear);
            setPopulation(population);
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getStreet() {
            return street;
        }

        public void setParCity(String parCity) {
            this.parCity = parCity;
        }

        public String getParCity() {
            return parCity;
        }

        public void setBuildYear(int buildYear) {
            this.buildYear = buildYear;
        }

        public int getBuildYear() {
            return buildYear;
        }

        public void setPopulation(long population) {
            this.population =  population;
        }

        public long getPopulation() {
            return population;
        }

        public void getFullInformation() {
            System.out.println("City - " + cityName + ", street - " + getStreet() + ", " + getParCity() + ", "
                    + getBuildYear() + " year, population - " + getPopulation());
        }
    }
}