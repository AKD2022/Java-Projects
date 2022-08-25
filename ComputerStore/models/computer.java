package models;

public class Computer {
    private String model;
    private String OS;
    private int year;
    private double price;
    private boolean isAvailable;

    public Computer(String model, String OS, double price) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("model must contain a value");
        }
        if (OS.isEmpty() || OS == null) {
            throw new IllegalArgumentException("OS must be filled in");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Invalid price");
        }
        this.model = model;
        this.OS = OS;
        this.price = price;
        this.isAvailable = true;
    }

    public Computer(Computer source) {
        this.model = source.model;
        this.OS = source.OS;
        this.year = source.year;
        this.price = source.price;
        this.isAvailable = source.isAvailable;
    }

    public String getModel() {
        return model;
    }
    
    public String getOS() {
        return OS;
    }

    public double getprice() {
        return price;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setModel(String model) {
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("model cannot be null/blank");
        }
        this.model = model;
    }

    public void setOS(String OS) {
        if (OS.isEmpty() || OS == null) {
            throw new IllegalArgumentException("OS must be filled in");
        }
        this.OS = OS;
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
        return "\t Model: " + this.model + "\n" +
               "\t OS (Operating System): " + this.OS + "\n" +
               "\t Price: " + this.price + "\n" +
               "\t Availability: " + (this.isAvailable ? "in-stock" : "out of stock") + "\n";
    }

    

}