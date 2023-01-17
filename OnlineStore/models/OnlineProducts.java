package Models;

public class OnlineProducts {
    private String Product;
    private double price;
    private boolean isAvailable;
    


    public OnlineProducts (String Product) {
        if (Product == null || Product.isBlank()) {
            throw new IllegalArgumentException("Type of product must be valid");
        } 

        this.Product = Product;
        this.isAvailable = true;
    }

    public OnlineProducts (OnlineProducts source) {
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

    public void setTypeOfProduct(String typeOfProduct) {
        if (typeOfProduct == null || typeOfProduct.isBlank()) {
            throw new IllegalArgumentException("must be valid type of product");
        }
        this.typeOfProduct = typeOfProduct;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be below 0");
        }
        this.price = price;
    }

    public String toString() {
        return "Product: " + this.product +
        "Price: " + this.price + 
        "Is Available: " + this.isAvailable;
    }

    public boolean setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
        return isAvailable;
    }

    pubilc String toString() {
        
    }
}
