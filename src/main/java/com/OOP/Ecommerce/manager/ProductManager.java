package com.OOP.Ecommerce.manager;

import com.OOP.Ecommerce.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private List<Product> products ;

    public ProductManager() {
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        if (products==null)
        {
            this.products=new ArrayList<Product>();
        }else
        {
            this.products=products;
        }
    }

    public void addProduct(Product product) {
        if (product==null)
        {
            System.out.println("Product is null");
        }else
        {
            this.products.add(product);
        }
    }

    public void removeProduct(long productId) {
        for (Product product : products) {
            if (product.getId()==productId)
            {
                products.remove(product);
                return;
            }
        }
    }

    public void viewAllProducts(){
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
    public String updateStock(long productID,int newStock) {
        for (Product product : products) {
            if (product.getId()==productID)
            {
                product.setQuantity(newStock);
                return "Product updated successfully";
            }
        }
        return "Product not found";
    }
}
