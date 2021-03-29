package lesson18.library;
import lombok.Builder;
import org.w3c.dom.NodeList;

import java.util.ArrayList;


@Builder
public class Book {
    private String bookName;
    private String author;
    private Genre genre;
    public static ArrayList<Book> books;


    public Book(String bookName,String author,Genre genre){
        this.bookName=bookName;
        this.author=author;
        this.genre=genre;
    }
    public Book(){

    }

    public String getBookName(String string) {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor(String author) {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre(Genre genre) {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "name - " + bookName +", author - " + author + ", genre - " + genre + "\n";
    }

}
