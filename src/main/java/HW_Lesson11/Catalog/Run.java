package HW_Lesson11.Catalog;

public class Run {
    public static void main(String[] args) {
        Catalog alla = new Catalog("Alla", 76 );
        Catalog.BlackList allaBlack = alla.new BlackList();
        Catalog.LoverToRead allaRead = alla.new LoverToRead(1);

        alla.returnCatalogInfo();
        allaBlack.blackListReaders();
        allaRead.readALot();

        Catalog liza = new Catalog("Liza", 6);
        Catalog.BlackList lizaBlack = liza.new BlackList();
        Catalog.LoverToRead lizaRead = liza.new LoverToRead(7);

        liza.returnCatalogInfo();
        lizaBlack.blackListReaders();
        lizaRead.readALot();
    }
}
