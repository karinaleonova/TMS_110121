package lesson18.library;

import java.util.ArrayList;

public enum Genre {

    ROMAN ("Romance") ,
    HISTORY ("History"),
    MEMOIR ("Memoir"),
    NOVEL ("Novel");

    private String title;


    Genre(String title) {
        this.title = title;
    }


    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return  title ;
    }
}
