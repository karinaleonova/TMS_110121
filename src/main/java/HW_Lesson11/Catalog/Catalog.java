package HW_Lesson11.Catalog;

//Создать класс Catalog с внутренним классом, с помощью объектов которого можно хранить информацию
//об истории выдачи книги читателям.

public class Catalog {
    private String libraryName;

    public Catalog() {
        libraryName = "West Library";
    }

    public Catalog(String libraryName) {
        this.libraryName = libraryName;
    }

    class CatalogInfo {
        private String clientName;
        private int bookCount;
        private int bookLeaseDays;

        private boolean goodClient(){
            if(bookCount>2)return true;
            else return false;
        }

        CatalogInfo() {
            this.clientName = "Alla";
            this.bookCount = 3;
            this.bookLeaseDays = 19;
            this.goodClient();
        }

        CatalogInfo(String clientName,int bookCount, int bookLeaseDays) {
            setClientName(clientName);
            setBookCount(bookCount);
            setBookLeaseDays(bookLeaseDays);

        }

        public void setClientName(String clientName) {
            this.clientName = clientName;
        }

        public String getClientName() {
            return clientName;
        }

        public void setBookCount(int bookCount) {
            this.bookCount = bookCount;
        }

        public int getBookCount() {
            return bookCount;
        }

        public void setBookLeaseDays(int bookLeaseDays) {
            this.bookLeaseDays = bookLeaseDays;
        }

        public int getBookLeaseDays() {
            return bookLeaseDays;
        }

        public void getFullInformation() {
            System.out.println("Library - " + libraryName + ", client name - " + getClientName() + ", took " + bookCount + " books, for "
                    + getBookLeaseDays() + " days, good client - " + goodClient());
        }
    }
}
