package com.OOP.Ecommerce;

import com.OOP.Ecommerce.manager.CustomerManager;
import com.OOP.Ecommerce.manager.OrderManager;
import com.OOP.Ecommerce.manager.ProductManager;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        CustomerManager customerManager = new CustomerManager();
        OrderManager orderManager = new OrderManager();

        //////////////////////// Product ///////////////////////////
        Product product1 = new Product(1L, "Bag", 350, "Is Good", 1);
        Product product2 = new Product(2L, "Shoes", 150, "Running Shoes", 10);
        Product product3 = new Product(3L, "Pizza", 150, "Pizza", 10);
        productManager.addProduct(product1);
        productManager.addProduct(product2);
        productManager.addProduct(product3);
        productManager.removeProduct(1);
        productManager.viewAllProducts();

        //////////////////////// Customer /////////////////////////////////
        Customer customer1 = new Customer(1L, "Ahmed Elhdad","Cairo","ahmedelhdad@gmail.com");
        Customer customer2 = new Customer(2L, "abd","ALX","abdo@gmail.com");
        customerManager.addCustomer(customer1);
        customerManager.addCustomer(customer2);
        customerManager.removeCustomer(1L);
        customerManager.printCustomers();
        /////////////////////////////// Order ////////////////////////////////////
        Order order1 = new Order(1L, customer2, List.of(product2));
        orderManager.addOrder(order1);
        orderManager.printOrders();
        double totalAmount=order1.calculateTotalAmount(order1.getProductList());
        System.out.println(totalAmount);

    }
}