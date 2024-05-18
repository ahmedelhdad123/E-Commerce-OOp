package com.OOP.Ecommerce;

import com.OOP.Ecommerce.personalInfo.PersonalInformation;

public class Product extends PersonalInformation {

    private double price;
    private String description;
    private int quantity;

    public Product() {
    }

    public Product(Long id, String name, double price, String description, int quantity) {
        super(id, name);
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + getId()+
                ", name='" + getName()+'\'' +
                "price=" + price +
                ", description='" + description + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
