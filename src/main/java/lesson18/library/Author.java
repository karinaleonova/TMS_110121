package lesson18.library;

public class Author {

    private String authorsName;

    public String getAuthorsName() {
        return authorsName;
    }

    public void setAuthorsName(String authorsName) {
        this.authorsName = authorsName;
    }
    public Author(String authorsName){
        this.authorsName=authorsName;
    }

    @Override
    public String toString() {
        return " " + authorsName + " ";
    }
}
