package com.OOP.Ecommerce.manager;

import com.OOP.Ecommerce.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    private List<Customer> customers;

    public CustomerManager() {
        this.customers = new ArrayList<>();
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        if (customers == null) {
            this.customers = new ArrayList<>();
        }else
        {
            this.customers = customers;
        }
    }
    public void addCustomer(Customer customer) {
        if (customer != null) {
            customers.add(customer);
        }else
        {
            System.out.println("Customer is null");
        }
    }
    public void removeCustomer(long customerId) {
       for (Customer customer : customers) {
           if (customer.getId() == customerId) {
               customers.remove(customer);
               return;
           }
       }
    }
    public void printCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }
}

