package HW_Lesson11.Catalog;

public class Run {
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        Catalog.CatalogInfo first = catalog.new CatalogInfo();
        Catalog gogolLibrary = new Catalog("Gogol library");
        Catalog.CatalogInfo second = gogolLibrary.new CatalogInfo("Rita",1,20);
        Catalog centraal = new Catalog("Rotterdam Centraal Library");
        Catalog.CatalogInfo third = centraal.new CatalogInfo("Victor",5,21);

        first.getFullInformation();
        second.getFullInformation();
        third.getFullInformation();

    }
}
