package Lesson10.Clothes;
//2) По аналогии с первым задание делаем след. задание.
//        Интерфейсы:
//        - Куртка
//        - Штаны
//        - Обувь
//        в каждом интерфейсе есть 2 метода (надеть и снять)
//        Делаем несколько реализации каждого интерфейса.
//        Создаём класс человек:
//        У человека поля:
//        -имя
//        -куртка
//        -штаны
//        -обувь
//        У человека есть 2 метода:
//        - одеться(вызываются методы надеть у всех вещей)
//        - раздеться (вызываются методы снять у всех вещей)


public class Person implements IPerson {
    private String name;
    private Jacket jacket;
    private Trousers trousers;
    private Shoes shoes;

    public Person(String name, Jacket jacket, Trousers trousers, Shoes shoes){
        this.name = name;
        this.jacket = jacket;
        this.trousers = trousers;
        this.shoes = shoes;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setTrousers(Trousers trousers) {
        this.trousers = trousers;
    }

    public Trousers getTrousers() {
        return trousers;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Shoes getShoes() {
        return shoes;
    }

    @Override
    public void getDressedAll() {
        System.out.println(getName() + " puts on clothes : ");
        jacket.getDressed();
        trousers.getDressed();
        shoes.getDressed();
    }

    @Override
    public void undressAll() {
        System.out.println(getName() + " takes off clothes : ");
        jacket.undress();
        trousers.undress();
        shoes.undress();
    }
}