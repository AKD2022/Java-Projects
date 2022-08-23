import models.Computers;

public class Main {
    public static void main(String[] args) {
        Computers computer = new Computers("Dell XPS 15", 2021, "Windows 11", 1599.99);

        System.out.println(computer);
    }
}
