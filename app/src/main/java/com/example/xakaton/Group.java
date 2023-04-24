package com.example.xakaton;

public class Group {
    public Group(int id, String name, int number) {   //конструктор
        this.id = id;
        this.name = name;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }                        //создаем геттеры и сеттеры для студентов

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    private int id; //нужные данные
    private String name;
    private int number;
}
