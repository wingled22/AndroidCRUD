package com.wingled22.androidcrud;

public class ProductSample {
    private int Id;
    private String Name;
    private  String Description;
    private int Image;

    public ProductSample(int id, String name, String description, int image) {
        Id = id;
        Name = name;
        Description = description;
        Image = image;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

}