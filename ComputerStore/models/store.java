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

    public void action(String model, String action) {
        if (Computers.isEmpty()) {
            throw new IllegalStateException("Store not in a valid state to perform action");
        }
        if (!(action.equals("sell"))) {
            throw new IllegalArgumentException("action must be sell");
        }
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("model cannot be null/blank");
        }
        for (int i = 0; i < this.Computers.size(); i++) {
            if (this.Computers.get(i).getModel().equals(model)) {
                switch (action) {
                    case "sell":
                    if (!(Computers.get(i).isAvailable())) {
                        throw new IllegalStateException("Cannot sell Computer that was rented out");
                    }
                    this.Computers.remove(i); break;
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