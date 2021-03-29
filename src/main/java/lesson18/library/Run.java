package lesson18.library;
//2. Написать программу библиотеки.
//        Необходимые условия:
//        1.программа должна вычитывать данные о книгах из XML файла,
//        2.предварительно этот файл провалидировав схемой
//        3.Программа должна создавать объекты книг, авторов, жанров
//        (жанры должны быть созданы как enum) и складывать их в
//        коллекцию books (List, Set, можете сложить книги по авторам - тогда Map)
//        в программе должно быть консольное меню со следующими вариантами работы:

//        Добавить книгу (при добавлении книги мы должны создать для неё
//        (или, если уже существует, то использовать существующие) объект автора и жанра
//        Отредактировать книгу
//        Удалить книгу
//        Вывести список всех книг
//        Вывести список книг определенного автора/жанра
//        Вывести список книг по алфавиту
//        при завершении программы все изменения должнызаписываться
//        в xml файл и при следующем старте загружаться из этого файла

import java.io.File;
import java.io.IOException;
import java.sql.*;

import java.util.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.lang.String;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

import static lesson18.library.Book.*;


public class Run {

    public static void main(String[] args) {

        try {
            DocumentBuilder docParser = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            Document document = docParser.parse("src/main/java/lesson18/library/books.xml");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Books","root","****");
            Scanner sc = new Scanner(System.in);

            SchemaFactory factory = SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
            Schema schema = factory.newSchema(new File("src/main/java/lesson18/library/book.xsd"));
            Validator validator = schema.newValidator();
            validator.validate(new DOMSource(document));
            System.out.println("XML is valid against the given schema \n");


            System.out.println(" *If you need add new Book put '1' \n *If you need update book put '2' \n *If you need remove book put '3' " +
                    "\n *If you need print all books put '4' \n *If you need print a certain genre/book name /author put '5' " +
                    "\n *I you need all books for alphabet put '6' ");

            addXMLtoBaseDate(conn,document);
            int i = sc.nextInt();
            if(i == 1){ createNewBook(conn); }
            if(i == 2){ updateBook(conn); }
            if(i == 3){ removeBook(conn); }
            if(i == 4){ printAllBookInfo(conn); }
            if(i == 5){ certainBookInfo(conn);}
            if(i == 6){ alphabetBook(conn);}

        } catch (ParserConfigurationException ex) {
            ex.printStackTrace(System.out);
        } catch (SAXException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    private static void addXMLtoBaseDate(Connection conn, Document document) throws SQLException {
        document.getDocumentElement().normalize();

        List<String> booksList = new ArrayList<>();
        NodeList nodeList = document.getElementsByTagName("book");
        Book lang = new Book();
        for (int i = 0; i < nodeList.getLength(); i++) {
            if (nodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) nodeList.item(i);
                booksList.add(lang.getAuthor(getTagValue("author", element)));
                booksList.add(lang.getAuthor(getTagValue("bookName", element)));
                booksList.add(String.valueOf(lang.getGenre(Genre.valueOf(getTagValue("genre", element)))));
            }
        }

        String sq = "INSERT INTO books (author,bookName,genre)VALUES(?,?,?)";
        PreparedStatement pr = conn.prepareStatement(sq);
        for(int i=0;i<booksList.size();i++){

            pr.setString(1,booksList.get(0));
            pr.setString(2,booksList.get(1));
            pr.setString(3,booksList.get(2));

        }
        pr.executeUpdate();
    }
    private static String getTagValue(String tag, Element element) {
        NodeList nodeList = element.getElementsByTagName(tag).item(0).getChildNodes();
        Node node = (Node) nodeList.item(0);
        return node.getNodeValue();
    }
    private static void printAllBookInfo(Connection conn){
        try {

            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("select * from books");
            while (rs.next()){
                Book book = (builder()
                        .author(rs.getString(1))
                        .bookName(rs.getString(2))
                        .genre(Genre.valueOf(rs.getString(3)))
                        .build());
                System.out.println(book);
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
    private static void createNewBook(Connection conn){
        try {

            Statement statement = conn.createStatement();
            int rows = statement.executeUpdate("INSERT books(author, bookName,genre) VALUES ('Mark Twain', 'The Adventures of Tom Sawyer','ROMAN')," +
                    "('Dan Brown', 'Angels and Demons','ROMAN')" + "('Test', 'Test','MEMOIR')");
            System.out.printf("Added %d rows", rows);
        }

         catch(Exception ex){
        System.out.println("Connection failed...");

        System.out.println(ex);
        }
    }
    private static void updateBook(Connection conn){
        try {

            Statement statement = conn.createStatement();

            int rows = statement.executeUpdate("UPDATE books SET author = 'newTest' where bookName = 'Test'");
            System.out.printf("Updated %d rows", rows);

    }
         catch(Exception ex){
        System.out.println("Connection failed...");

        System.out.println(ex);
        }
    }
    private static void removeBook(Connection conn){
        try {

            Statement statement = conn.createStatement();

            int rows = statement.executeUpdate("DELETE FROM books WHERE bookName = 'Test'");
            System.out.printf("%d row(s) deleted", rows);
    }
         catch(Exception ex){
        System.out.println("Connection failed...");

        System.out.println(ex);
        }
    }
    private static void certainBookInfo(Connection conn){
        try {

            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM books WHERE genre = 'NOVEL';");
            while (rs.next()){
                Book book = (builder()
                        .author(rs.getString(1))
                        .bookName(rs.getString(2))
                        .genre(Genre.valueOf(rs.getString(3)))
                        .build());
                System.out.println(book);
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
    private static void alphabetBook(Connection conn){
        try {

            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM books ORDER BY bookName ;");
            while (rs.next()){
                Book book = (builder()
                        .author(rs.getString(1))
                        .bookName(rs.getString(2))
                        .genre(Genre.valueOf(rs.getString(3)))
                        .build());
                System.out.println(book);
            }
        }
        catch(Exception ex){
            System.out.println("Connection failed...");

            System.out.println(ex);
        }
    }
}