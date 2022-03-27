package com.example.calculator.data;

import java.io.Serializable;

public class Note implements Serializable { //Класс заметки для адаптера


    public static final String NOTE = "NOTE";
    private Integer id;
    private String title;
    private String description;

    public Note(String title, String description) { //Конструктор из заголовка и описания
        this.title = title;
        this.description = description;
    }

    //Генерируев геттеры и сеттеры для возможности редактирования приватных переменных


    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
