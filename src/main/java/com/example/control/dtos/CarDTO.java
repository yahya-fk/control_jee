package com.example.control.dtos;

import lombok.*;


public class CarDTO {
    private String model;
    private String color;
    private String matricul;
    private float price;

    public CarDTO(String color, String model, String matricul, float price) {
        this.color = color;
        this.model = model;
        this.matricul = matricul;
        this.price = price;
    }
    public CarDTO() {
    }
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMatricul() {
        return matricul;
    }

    public void setMatricul(String matricul) {
        this.matricul = matricul;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
