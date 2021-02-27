package Lesson13.Store;
//          В main:
//        •создаем объект магазина
//        •создаем пару тройку товаров и добавляем эти товары в магазин
//        •получаем список товаров из магазина, сортируем по цене(по
//        возрастанию) и выводим в консоль.
//        •удаляем один товар
//        •получаем список товаров из магазина, сортируем по порядку
//        добавления(последние добавленные в начале) и выводим в консоль.
//        •редактируем один товар
//        •получаем список товаров и выводим в консоль

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Run {
    public static void main(String[] args) {

        Product kip = new Product(1, "Kip", 12);
        Product steak = new Product(2, "Steak", 32);
        Product apple = new Product(3, "Apple", 4);
        Product apple1 = new Product(3, "Apple", 4);

        Store.addNewProduct(kip);
        Store.addNewProduct(steak);
        Store.addNewProduct(apple);
        Store.addNewProduct(apple1);

         ArrayList<Product> products =  Store.returnArrayList();

        Collections.sort(products);
        System.out.println("Sort by price : ");
        for(Product p : products){
            System.out.println(p.getId()+ " " +p.getName() + " " + p.getPrice());
        }

        Store.removeProductId(steak);

        System.out.println("Sort by adding order : ");
        for (int i = products.size() - 1; i >= 0; i--){
            System.out.println(products.get(i).getName());
        }

        Store.correctProductList(kip,67,"Tomato",6);

        System.out.println("Product list : ");
        for(Product p : products){
            System.out.println(p.getId()+ " " +p.getName() + " " + p.getPrice());
        }
    }
}
