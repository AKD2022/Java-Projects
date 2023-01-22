package Models;

public class Products {
    private String product;
    private double price;
    private boolean isAvailable;
    private int amount;
    private String category;

    public Products(String product, String category, double price, int amount) {
        if (product == null || product.isBlank()) {
            throw new IllegalArgumentException("product must contain a value");
        }
        if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("category must contain a value");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Invalid price");
        }
        if (price < 0) {
            throw new IllegalArgumentException("amount cannot be below 0");
        }
        this.product = product;
        this.price = price;
        this.category = category;
        this.amount = amount;
        this.isAvailable = true;
    }

    public Products(Products source) {
        this.product = source.product;
        this.price = source.price;
        this.category = source.category;
        this.amount = source.amount;
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

    public int getAmount() {
        return amount;
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

    public void setAmount(int amount) {
        if (category == null || category.isBlank()) {
            throw new IllegalArgumentException("Must have amount");
        }
        this.amount = amount;
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
               "\t Amount of " + this.product + " you Recieve: " + this.amount + "\n" +
               "\t Availability: " + (this.isAvailable ? "in-stock" : "out of stock");
    }

    

}