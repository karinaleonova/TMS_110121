package Lesson13.Store;
//Создать класс Товар, поля:
//        •id(целое число)
//        •name(строка)
//        •price(целое число)

public class Product implements Comparable<Product>{

    private int id;
    private String name;
    private int price;

    @Override
    public int compareTo(Product o) {
        return Integer.compare(this.getPrice(),o.getPrice());
    }

    public Product(int id, String name, int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}