package HW_Lesson11.City;

public class Run {
    public static void main(String[] args) {

        City city = new City();
        City.Information first = city.new Information();
        City.Information second = city.new Information("Kortebranstraat", "West", 1978, 156000);
        City cityAmsterdam = new City("Amsterdam");
        City.Information third = cityAmsterdam.new Information("Dijkstraat", "Zuid", 1998, 543000);
        City cityDelft = new City("Delft");
        City.Information fourth = cityDelft.new Information("Voorhofdreef","Center",2002,34000);

        first.getFullInformation();
        second.getFullInformation();
        third.getFullInformation();
        fourth.getFullInformation();
    }
}
