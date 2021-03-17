package lesson15.dopTask4;


//4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
//        сериализации произвести обратный процесс

import java.io.Serializable;

public class Car implements Serializable {
    private String brand;
    private int speed;
    private int price;

    public Car(String brand, int speed,int price){
        this.brand = brand;
        this.speed = speed;
        this.price = price;

    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", speed=" + speed +
                ", price=" + price +
                '}';
    }
}
