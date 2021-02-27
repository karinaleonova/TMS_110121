package HW_Lesson11.City;

public class Run {
    public static void main(String[] args) {

        City tallinn = new City("Tallinn","Europe");
        City.EuropeanUnion tallinnEu = tallinn.new EuropeanUnion();
        City.CityPopulation tallinnPop = tallinn.new CityPopulation(346892);

        tallinn.returnCityInfo();
        tallinnPop.moreMillionPopulation();
        tallinnEu.inEurope();

        City tokio = new City("Tokio","Azia" );
        City.EuropeanUnion tokioEu = tallinn.new EuropeanUnion();
        City.CityPopulation tokioPop = tallinn.new CityPopulation(13763906);

        tokio.returnCityInfo();
        tokioPop.moreMillionPopulation();
        tokioEu.itIsNotEurope();
    }
}
