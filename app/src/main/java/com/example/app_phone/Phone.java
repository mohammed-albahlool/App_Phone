package com.example.app_phone;

import android.graphics.drawable.Drawable;

public class Phone {



    String name;
    String model;
    String color;
    String note;
    int price;
   int photoIm;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPhotoIm() {
        return photoIm;
    }

    public void setPhotoIm(int photoIm) {
        this.photoIm = photoIm;
    }
}
