import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import models.Computer;
import models.Store;

public class Main {
    

    static Store store = new Store();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n********************JAVA COMPUTER STORE ********************\n");
        try {
            loadComputers("Computers.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("COMPUTERS LOADED\n\n");
            System.out.println(store);
            manageComputers();
        }

    }

    /**
     * Name: manageComputers
     * Inside the function:
     *   • 1. Starts a new instance of Scanner;
     *   • 2. In an infinite loop, the user can choose to a) purchase b) rent c) return d) exit.
     *   •        case a: ask for the name and sell.
     *   •        case b: ask for the name and rent.
     *   •        case c: ask for the name and return.
     *   • 3. call close() from the Scanner object.
     * @throws InterruptedException
     */

     public static void manageComputers() throws InterruptedException {
         Scanner scan = new Scanner(System.in);
         while (true) {
            System.out.println("\nType 'a' to buy a computer");
            String response = scan.nextLine();

            if (!(response.equals("a"))) {
                scan.close();
                break;
            }

            System.out.print("Enter the name of the Computer: ");
            String name = scan.nextLine();
            if (store.getComputer(name) == null) {
                System.out.println("\n\nThe input you provided is not valid. Please try again\n");
                continue;
            }

            switch (response) {
                case "a":
                 if (!(store.getComputer(name).isAvailable())) {
                    System.out.println("\n\n\n\nThe Computer is not available for purchase. Please try again\n");
                    continue;
                 }
                 store.action(name, "sell"); break;

            }
            System.out.println("\n\nCOMPUTER SUCCESFULLY BOUGHT\n\n" + store);
            Thread.sleep(2000 );
         }
     }





    /**
     * Name: loadComputers
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     * Inside the function:
     *   • 1. loads Computers from <fileName>.txt.
     *   • 2. adds all Computers to the store object's Computer field.
     */

     public static void loadComputers(String fileName) throws FileNotFoundException {
         FileInputStream fis = new FileInputStream(fileName);
         Scanner scanFile = new Scanner(fis);

         while (scanFile.hasNextLine()) {
             String line = scanFile.nextLine();
             String[] words = line.split("--");
             store.addComputer(new Computer(words[0], words[1], Double.parseDouble(words[2])));
         }
         scanFile.close();
     }


}