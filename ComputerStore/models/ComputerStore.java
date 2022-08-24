package models;

import java.util.ArrayList;

public class ComputerStore {
    ArrayList<Computers> computer;

    public ComputerStore() {
        this.computer = new ArrayList<Computers>();
    }

    public Computers getMovie(int index) {
        return new Computers(this.computer.get(index));
    }

    public Computers getComputers(String model) {
        for (int i = 0; i < this.computer.size(); i++) {
            if (this.computer.get(i).getModel().equals(model)) {
                return new Computers(this.computer.get(i));
            }
        }
        return null;
    }

    public void setModel(int index, Computers computers) {
        this.computer.set(index, new Computers(computers));
    }

    public void addComputers(Computers computers) {
        this.computer.add(new Computers(computers));
    }

    public void action(String model, String action) {
        if (computer.isEmpty()) {
            throw new IllegalStateException("Store not in a valid state to perform action");
        }
        if (!(action.equals("buy"))) {
            throw new IllegalArgumentException("action must be buy");
        }
        if (model == null || model.isBlank()) {
            throw new IllegalArgumentException("model cannot be null/blank");
        }
        for (int i = 0; i < this.computer.size(); i++) {
            if (this.computer.get(i).getModel().equals(model)) {
                switch (action) {
                    case "sell":
                    if (!(computer.get(i).isAvailable())) {
                        throw new IllegalStateException("Cannot sell computer that is bought");
                    }
                    this.computer.remove(i); break;
                }
            }  
        }
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < this.computer.size(); i++) {
            temp += this.computer.get(i).toString();
            temp += "\n\n";
        }
        return temp;
    }




}
