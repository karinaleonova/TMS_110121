package Lesson10.Bank;

//Создать иерархию классов, описывающих банковские карточки.
//        Иерархия должна иметь хотя бы три уровня.

public class BankCard {
    private final String client;
    private final int limit;

    public BankCard(String name ,int limit) {
        this.client = name;
        this.limit = limit;
    }

    @Override
    public String toString() {
        return "My name is " + client + ", my cart limit is  " + limit + " ";
    }
}



