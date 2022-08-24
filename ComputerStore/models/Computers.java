package models;


public class Computers {
    private String model;
    private int year;
    private String OS;
    private double price;

    public Computers(String model, int year, String OS, double price) {
        if (model.isBlank() || model == null) {
            throw new IllegalArgumentException("model cannot be blank/null");
        } else if (OS.isEmpty()) {
            throw new IllegalArgumentException("OS cannot be empty");
        } else if (price < 0) {
            throw new IllegalArgumentException("price cannot be below 0");
        } else if (year < 0) {
            throw new IllegalArgumentException("INVALID year");
        }

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
        if (model.isBlank() || model == null) {
            throw new IllegalArgumentException("model cannot be blank/null");
        }
    }

    public void setOS(String oS) {
        OS = oS;
        if (OS.isEmpty()) {
            throw new IllegalArgumentException("OS cannot be empty");
        }
    }

    public void setPrice(double price) {
        this.price = price;
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be below 0");
        }
    }

    public void setYear(int year) {
        this.year = year;
        if (year < 0) {
            throw new IllegalArgumentException("INVALID year");
        }
    }

    public String toString() {
        return "\nModel: " + this.model +
        "\nOperating System (OS): " + this.OS + 
        "\nPrice: $" + this.price + 
        "\nYear: "  + this.year;
    }

}
