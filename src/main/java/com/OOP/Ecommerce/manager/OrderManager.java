package com.OOP.Ecommerce.manager;

import com.OOP.Ecommerce.Order;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderManager {
    private List<Order> orders;

    public OrderManager() {
        this.orders = new ArrayList<>();
    }
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        if (orders == null) {
            this.orders = new ArrayList<>();
        }else
        {
            this.orders = orders;
        }
    }

    public void addOrder(Order order) {
        if (order != null) {
            orders.add(order);
        }else
        {
            System.out.println("Order is null");
        }
    }
    public void removeOrder(long orderId) {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getOrderID()==orderId)
            {
                iterator.remove();
                return;
            }
        }
    }

    public void printOrders() {
        for (Order order : orders) {
            System.out.println(order);
        }
    }

}
