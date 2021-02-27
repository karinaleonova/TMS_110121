package HW_Lesson11.Catalog;

//Создать класс Catalog с внутренним классом, с помощью объектов которого можно хранить информацию
//об истории выдачи книги читателям.

public class Catalog {
    private String visitorName;

    private int days;

    public Catalog(String visitorName, int days){
        this.visitorName = visitorName;
//        this.bookNumber = bookNumber;
        this.days = days;
    }

    public void returnCatalogInfo() {

        System.out.println(visitorName +" ," +" ,"+days+".");
    }

    public class BlackList{

        public boolean blackListReaders(){
            if( days > 60 ){
                System.out.println("The reader not returned books for more than 60 days , Reader is the BLACK LIST !");
                return true;
            }
            else System.out.println(" Good reader !"); return false;
        }
    }

    public class LoverToRead{
        private int bookNumber;
        public LoverToRead(int bookNumber){
            this.bookNumber = bookNumber;
        }

        public int getBookNumber() {
            return bookNumber;
        }

        public void setBookNumber(int bookNumber) {
            this.bookNumber = bookNumber;
        }

        public void readALot(){
            if(this.bookNumber > 5) System.out.println(this.bookNumber + " this is a very good number of books, you love read books!");

            else if( this.bookNumber > 0 && this.bookNumber <= 5 ) System.out.println(" You like read books .");

            else System.out.println("Did not take any books.");

        }
    }
}
