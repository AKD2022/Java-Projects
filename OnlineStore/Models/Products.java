package Models;

public class Products {
    private String product;
    private double price;
    private boolean isAvailable;
    private String category;

    public Products(String product, String category, double price) {
        if (product == null || product.isBlank()) {
            throw new IllegalArgumentException("product must contain a value");
        }
        if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("category must contain a value");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Invalid price");
        }
        this.product = product;
        this.price = price;
        this.category = category;
        this.isAvailable = true;
    }

    public Products(Products source) {
        this.product = source.product;
        this.price = source.price;
        this.category = source.category;
        this.isAvailable = source.isAvailable;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setProduct(String product) {
        if (product == null || product.isBlank()) {
            throw new IllegalArgumentException("product cannot be null/blank");
        }
        this.product = product;
    }

    public void setCategory(String category) {
        if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("category cannot be null/blank");
        }
        this.category = category;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("invalid price");
        }
        this.price = price;
    }

    public boolean setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return isAvailable;
    }

    public String toString() {
        return "\t Category: " + this.category + "\n" +
               "\t Product: " + this.product + "\n" +
               "\t Price: " + this.price + "\n" +
               "\t Availability: " + (this.isAvailable ? "in-stock" : "out of stock") + "\n";
    }

    

}