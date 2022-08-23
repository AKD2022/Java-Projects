package models;

public class Computers {
    private String model;
    private int year;
    private String OS;
    private double price;

    public Computers(String model, int year, String OS, double price) {
        this.model = model;
        this.year = year;
        this.OS = OS;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public String getOS() {
        return OS;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setOS(String oS) {
        OS = oS;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    

}
