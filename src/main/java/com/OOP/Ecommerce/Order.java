package com.OOP.Ecommerce;

import java.util.List;

public class Order {
    private long orderID;
    private Customer customer;
    private List<Product> productList;

    public Order(long orderID, Customer customer, List<Product> productList) {
        this.orderID = orderID;
        this.customer = customer;
        this.productList = productList;
    }

    public long getOrderID() {
        return orderID;
    }

    public void setOrderID(long orderID) {
        this.orderID = orderID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", customer=" + customer +
                ", productList=" + productList +
                '}';
    }

    public double calculateTotalAmount(List<Product> productList) {
        double totalAmount = 0;
        for (Product product : productList) {
            totalAmount += product.getPrice() * product.getQuantity();
        }
        return totalAmount;
    }
}
