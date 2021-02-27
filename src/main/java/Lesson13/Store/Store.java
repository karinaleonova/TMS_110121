package Lesson13.Store;

import java.lang.reflect.Array;
import java.util.*;
//Создать класс Магазин, поля:
//        •Список товаров (изначально пустой)
//        методы:
//        •добавить товар(принимает объект товара и добавляет его в список
//        товаров). При попытке добавить товар с id уже существующем в списке,
//        вставка производится не должна
//        •получить все товары(метод ВОЗВРАЩАЕТ список всех товаров в
//        магазине)
//        •удалить товар (метод принимает id товара и удаляет из списка товар с
//        соответствующим id)
//        •редактировать товар(принимает объект товара и редактирует им список
//        товаров)

public class Store{
    private static ArrayList<Product> list = new ArrayList<>();
    private static ArrayList<Integer> usedId = new ArrayList<>();
    private static ArrayList<Integer> usedPrice = new ArrayList<>();


    public static void addNewProduct(Product product){
        if(!usedId.contains(product.getId())){
            usedId.add(product.getId());
            list.add(product);
        }
    }
    public static ArrayList<Product> returnArrayList(){
        return list;
    }
    public static void removeProductId(Product product){

        list.remove(product.getId());
    }
    public static void correctProductList(Product product,int newId, String newName,int newPrice){

        product.setName(newName);
        product.setId(newId);
        product.setPrice(newPrice);

    }
}