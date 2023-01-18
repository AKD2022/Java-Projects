package Models;

import java.util.ArrayList;

public class Store {
    ArrayList<Product> Products;

    public Store() {
        this.Products = new ArrayList<Products>();
    }    

    public Product getProducts(int index) {
        return new Products(this.Products.get(index));
    }

    public Product getProducts(String model) {
        for (int i = 0; i < this.Products.size(); i++) {
            if (this.Products.get(i).getProduct().equals(model)) {
                return new Products(this.Products.get(i));
            }
        }
        return null;
    }

    public void setProduct (int index, Product Products) {
        this.Products.set(index, new Products(Product));
    }

    public void addProduct (Product Products) {
        this.Products.add(new Product(Product));
    }

    public void action(String Product, String action) {
        if (Products.isEmpty()) {
            throw new IllegalStateException("Store not in a valid state to perform action");
        }
        if (!(action.equals("sell") || action.equals("end program"))) {
            throw new IllegalArgumentException("action must be sell or end");
        }
        if (Product == null || Product.isBlank()) {
            throw new IllegalArgumentException("product name cannot be null/blank");
        }
        for (int i = 0; i < this.Products.size(); i++) {
            if (this.Products.get(i).getProduct().equals(Product)) {
                switch (action) {
                    case "sell":
                    if (!(Products.get(i).isAvailable())) {
                        throw new IllegalStateException("Cannot sell product that is out of stock");
                    }
                    this.Products.remove(i); break;
                }
            }  
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.Products.size(); i++) {
            temp += this.Products.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }
    
}
