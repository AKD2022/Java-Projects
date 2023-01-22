import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

import Models.Products;
import Models.Store;

public class Main {
    

    static Store store = new Store();

    public static void main(String[] args) throws InterruptedException {
        System.out.println("\n********************ONLINE STORE ********************\n");
        try {
            loadProducts("Models/Products.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("PRODUCTS LOADED\n\n");
            System.out.println(store);
            manageProducts();
        }

    }

     public static void manageProducts() throws InterruptedException {
         Scanner scan = new Scanner(System.in);

         for (int i = 0; i < 100000000; i++) {
            //After Loop Ran once
            if (i >= 1) {
                System.out.println("\nType 'a' to continue shopping, press enter to end");
                String response = scan.nextLine();
                if (!(response.equals("a") || response.equals("b"))) {
                    scan.close();
                    break;
                }
    
                System.out.print("Enter the name of the product: ");
                String name = scan.nextLine();
                if (store.getProducts(name) == null) {
                    System.out.println("\n\nThe input you provided is not valid. Please try again\n");
                    continue;
                }
     
    
                switch (response) {
                    case "a":
                     if (!(store.getProducts(name).isAvailable())) {
                        System.out.println("\n\n\n\nThe Product is not available for purchase. Please try again\n");
                        continue;
                     }
                     store.action(name, "sell");
                     Thread.sleep(4000);
                     System.out.println("\n\nProduct SUCCESFULLY BOUGHT\n\n");
                     System.out.println("UPDATING STORE...");
                     Thread.sleep(2000); System.out.println(store); break;
                }
            }
            //Before Loop Runs Once (0th time)
            else {
                System.out.println("\nType 'a' to start shopping, press enter to end");
                String response = scan.nextLine();    
            

            if (!(response.equals("a") || response.equals("b"))) {
                scan.close();
                break;
            }

            System.out.print("Enter the name of the product: ");
            String name = scan.nextLine();
            if (store.getProducts(name) == null) {
                System.out.println("\n\nThe input you provided is not valid. Please try again\n");
                continue;
            }
 

            switch (response) {
                case "a":
                 if (!(store.getProducts(name).isAvailable())) {
                    System.out.println("\n\n\n\nThe Product is not available for purchase. Please try again\n");
                    continue;
                 }
                 store.action(name, "sell");
                 Thread.sleep(4000);
                 System.out.println("\n\nProduct SUCCESFULLY BOUGHT\n\n");
                 System.out.println("UPDATING STORE...");
                 Thread.sleep(2000); System.out.println(store); break;
            }
        
         }
    }
 }


     public static void loadProducts(String fileName) throws FileNotFoundException {
         FileInputStream fis = new FileInputStream(fileName);
         Scanner scanFile = new Scanner(fis);

         while (scanFile.hasNextLine()) {
             String line = scanFile.nextLine();
             String[] words = line.split(", ");
             store.addProducts(new Products(words[0], words[1], Double.parseDouble(words[2]), Integer.parseInt(words[3])));
         }
         scanFile.close();
     }


}