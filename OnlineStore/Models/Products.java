package Models;

public class Products {
    private String Product;
    private double price;
    private boolean isAvailable;
    

    public Products (String Product) {
        if (Product == null || Product.isBlank()) {
            throw new IllegalArgumentException("Type of product must be valid");
        } 

        this.Product = Product;
        this.isAvailable = true;
    }

    public Products (Products source) {
        this.Product = source.Product;
        this.price = source.price;
        this.isAvailable = source.isAvailable;
    }

    public String getProduct() {
        return Product;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setTypeOfProduct(String Product) {
        if (Product == null || Product.isBlank()) {
            throw new IllegalArgumentException("must be valid type of product");
        }
        this.Product = Product;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be below 0");
        }
        this.price = price;
    }

    public boolean setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return isAvailable;
    }

    public String toString() {
        return "Product: " + this.Product +
        "Price: " + this.price + 
        "Is Available: " + (this.isAvailable ? "in-stock" : "out of stock") + "\n";
    }

}
