import models.Computers;
import models.computer;

import java.util.Scanner;

import models.store;
public class Main {
    public static void main(String[] args) {
        System.out.println("************JAVA COMPUTER STORE************");
        try {
            loadMovies("movies.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("MOVIES LOADED\n\n");
            System.out.println(store);
            manageComputers();
        }
    }

    public static void manageComputers() {
        Scanner scan = new Scanner(System.in);
        while (true) {
           System.out.println("\nWould you like to \n\ta) purchase\n\tb) rent \n\tc) return.");
           String response = scan.nextLine();

           if (!(response.equals("a") || response.equals("b") || response.equals("c"))) {
               scan.close();
               break;
           }

           System.out.print("Enter the name of the movie: ");
           String name = scan.nextLine();
           if (store.getMovie(name) == null) {
               System.out.println("\n\nThe input you provided is not valid. Please try again\n");
               continue;
           }

           
                if (!(store.getMovie(name).isAvailable())) {
                   System.out.println("\n\n\n\nThe movie is not available for purchase. Please try again\n");
                   continue;
                }
                store.action(name, "sell"); break;
               
           System.out.println("\n\nUPDATED MOVIES\n\n" + store);
        }
    }

}
