import java.util.Scanner;

public class JavaJobs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("********************************");
        System.out.println("************JAVA JOBS **********");
        System.out.println("********************************\n");

        System.out.println("Welcome to JAVA Jobs. What would you like to do?");
        System.out.println("\t- Apply for a job (type a)");
        System.out.println("\t- Work a shift (type b)");
        System.out.println("\t- Ask for a raise (type c)");
        System.out.println("\t- Learn about Java (type d)");
        String option = scan.nextLine();

        switch(option) {
            case "a": break;
            case "b": break;
            case "c": break;
            case "d": break;
        }


        scan.close();
    }

    public static void applyJob() {
        System.out.println();
    }

}
