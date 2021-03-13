package lesson15.dopTask4;

//4) Сеарилизовать объект Автомобиль(Марка, скорость, цена). После
//        сериализации произвести обратный процесс

import java.io.*;

public class Run  {
    public static void main(String[] args) throws Exception{
        String path = "src/main/java/Lesson15/dopTask4/";

        Car car = new Car("BMW", 240, 37000);

        FileOutputStream outputStream = new FileOutputStream(path+"newCar.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);

        objectOutputStream.writeObject(car);

        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream(path+"newCar.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Car car1 = (Car) objectInputStream.readObject();

        System.out.println(car1);

        objectInputStream.close();
    }
}
