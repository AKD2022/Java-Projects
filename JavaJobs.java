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
            case "a": 
            System.out.println("\n\nWelcome to the Job applications. ");
            apply();

            break;
            
            case "b": break;
            case "c": break;
            case "d": break;
        }

        scan.close();
        
    }

    public static void apply(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Here are the jobs that we have available: ");
        System.out.println("\t- Game Developer,  200k year (type a)");
        System.out.println("\t- Game Designer, 150k year (type b)");
        System.out.println("\t- Course Developer, 150k year (type c)");
        System.out.println("\t- Java Web Developer, 125k year (type d)");
        System.out.println("\t- Basic Java Developer, 90k year (type e)");
        System.out.println("\t- App Designer, 150k year (type f)");
        System.out.println("\t- App Developer, 200k year (type g)");
        System.out.println("\t- OS Developer, 350k year (type h)");
        System.out.println("\t- OS Designer, 250k year (type i)");

        System.out.println("Which one would you like to do?");
        String a = scan.nextLine();

        switch(a) {
            //Game Developer
            case "a": 
            //Requirments
            System.out.println("Here are the requriments you need to become a game developer: ");

            System.out.println("\t- Bachelor's degree in software engineering or computer science");
            System.out.println("\t- Experience with full-cycle game design");
            System.out.println("\t- Experience building libraries and APIs.");
            System.out.println("\t- Be and advanced JAVA developer, including things like building apps from scratch");
            System.out.println("\t- Knowledge of the latest gaming trends");
            System.out.println("\t- Strong artistic and technical skills.");

            //Asking if meets requirments
            System.out.print("Do you meet all of these requirments?: ");
            String requirement = scan.nextLine();

            //Checking 
            if (!requirement.contains("y")) {
                System.out.println("We are sorry, but you are not eligible for this job.");
                System.exit(0);
            } 
            else if (requirement.contains("ye")) {
                System.out.println("Since we do not know if you are telling the truth or not, you must answer this question correctly: ");

                System.out.println("\tWhat is one part of a basic structure for developing a game?");
                String checking = scan.nextLine();

                if (checking.contains("The game interface") || checking.contains("The implementation of the interface") || checking.contains("The game source code")){
                    System.out.println("Good job! You are hired! Your check will be mailed to the address you type in: ");
                    String address = scan.nextLine();

                    System.out.println("Every month we will mail a check of $" + (200000/12) + " to " + address);
                    scan.close(); 
                }
              
            }
            


            break;
            case "b": break;
            case "c": break;
            case "d": break;
            case "e": break;
            case "f": break;
            case "g": break;
            case "h": break;
            case "i": break;
        }




        scan.close();
    }




    

}
