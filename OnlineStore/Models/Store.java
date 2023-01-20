package Models;

import java.util.ArrayList;

public class Store {
    ArrayList<Products> Product;

    public Store() {
        this.Product = new ArrayList<Products>();
    }

    public Products getProducts(int index) {
        return new Products(this.Product.get(index));
    }

    public Products getProducts(String product) {
        for (int i = 0; i < this.Product.size(); i++) {
            if (this.Product.get(i).getProduct().equals(product)) {
                return new Products(this.Product.get(i));
            }
        }
        return null;
    }

    public void setProduct(int index, Products Product) {
        this.Product.set(index, new Products(Product));
    }

    public void addProducts(Products Product) {
        this.Product.add(new Products(Product));
    }

    public void action(String name, String action) {
        if (Product.isEmpty()) {
            throw new IllegalStateException("Store not in a valid state to perform action");
        }
        if (!(action.equals("sell") || action.equals("end program"))) {
            throw new IllegalArgumentException("action must be sell or end program");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null/blank");
        }
        for (int i = 0; i < this.Product.size(); i++) {
            if (this.Product.get(i).getProduct().equals(name)) {
                switch (action) {
                    case "sell":
                    if (!(Product.get(i).isAvailable())) {
                        throw new IllegalStateException("Cannot sell product that is out of stock");
                    }
                }
            }  
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.Product.size(); i++) {
            temp += this.Product.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }


}