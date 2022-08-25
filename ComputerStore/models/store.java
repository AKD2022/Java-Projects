package models;

import java.util.ArrayList;

public class Store {
    ArrayList<Computer> Computers;

    public Store() {
        this.Computers = new ArrayList<Computer>();
    }

    public Computer getComputer(int index) {
        return new Computer(this.Computers.get(index));
    }

    public Computer getComputer(String model) {
        for (int i = 0; i < this.Computers.size(); i++) {
            if (this.Computers.get(i).getModel().equals(model)) {
                return new Computer(this.Computers.get(i));
            }
        }
        return null;
    }

    public void setComputer(int index, Computer Computer) {
        this.Computers.set(index, new Computer(Computer));
    }

    public void addComputer(Computer Computer) {
        this.Computers.add(new Computer(Computer));
    }

    public void action(String name, String action) {
        if (Computers.isEmpty()) {
            throw new IllegalStateException("Store not in a valid state to perform action");
        }
        if (!(action.equals("sell") || action.equals("rent") || action.equals("return") || action.equals("end program"))) {
            throw new IllegalArgumentException("action must be sell, rent, return, or end");
        }
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("name cannot be null/blank");
        }
        for (int i = 0; i < this.Computers.size(); i++) {
            if (this.Computers.get(i).getModel().equals(name)) {
                switch (action) {
                    case "sell":
                    if (!(Computers.get(i).isAvailable())) {
                        throw new IllegalStateException("Cannot sell movie that was rented out");
                    }
                    this.Computers.remove(i); break;
                    case "rent": this.Computers.get(i).setAvailable(false); break;
                    case "return": 
                    if (this.Computers.get(i).setAvailable(true)) {
                        throw new IllegalStateException("Cannot return none/bought items");
                    } else {
                    this.Computers.get(i).setAvailable(true); 
                    } break;
                }
            }  
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.Computers.size(); i++) {
            temp += this.Computers.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }


}