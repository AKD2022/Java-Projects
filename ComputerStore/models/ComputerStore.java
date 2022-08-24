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

}
