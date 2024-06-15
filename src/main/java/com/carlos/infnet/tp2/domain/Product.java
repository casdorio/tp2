package com.carlos.infnet.tp2.domain;

public class Product {
    
    private int id;
    private String name;
    private double value;
    private String description;

    public Product(int id, String name, double value, String description){
        this.id = id;
        this.name = name;
        this.value = value;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
