import java.util.Scanner;

public class JavaJobs {
    public static void main(String[] args) throws InterruptedException {
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

    /**
     * @throws InterruptedException
     * 
     */
    public static void apply() throws InterruptedException{
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
        String option = scan.nextLine();

        switch(option) {
            //Cases
            case "a": 
            //Requirments
            System.out.println("Here are the requirements you need to become a game developer: \n");

            System.out.println("\t- Bachelor's degree in software engineering or computer science");
            System.out.println("\t- Experience with full-cycle game design");
            System.out.println("\t- Experience building libraries and APIs.");
            System.out.println("\t- Be and advanced JAVA developer, including things like building apps from scratch");
            System.out.println("\t- Knowledge of the latest gaming trends");
            System.out.println("\t- Strong artistic and technical skills.");
            Thread.sleep(1000);
            //Asking if meets requirments
            System.out.println("\nDo you meet all of these requirments?: ");
            String requirement = scan.nextLine();

            //Checking 
            if (!requirement.contains("y")) {
                System.out.println("We are sorry, but you are not eligible for this job.");
                System.exit(0);
            } 

            else if (requirement.contains("ye")) {
                System.out.println("\nSince we do not know if you are telling the truth or not, you must answer this question correctly: ");

                System.out.println("\n\tWhat is one part of a basic structure for developing a game?");
                String checking = scan.nextLine();

                if (checking.contains("g") && checking.contains("i") || checking.contains("i") && checking.contains("p") && checking.contains("t") || checking.contains("s") && checking.contains("g") && checking.contains("d")){
                    System.out.println("\nGood job! You are hired!");
                    System.out.println("What is your address?");
                    String address = scan.nextLine();

                    System.out.println("Every month we will mail a check of $" + (200000/12) + " to " + address);
                    scan.close(); 
                }

                else {
                    System.out.println("\nYou do not know how to game develop! We are sorry, but you are not accepted");
                }
              
            }
            


            break;
            
            
            
        

            //Game Designer
            case "b": 
            
            
            System.out.println("\nHere are the requirements for a Game Designer");
            System.out.println("\t- A passion for video games");
            System.out.println("\t- Creativity");
            System.out.println("\t- Excellent verbal and written communication skills");
            System.out.println("\t- Technical ability in software technologies and programming languages, such as JAVA");
            System.out.println("\t- The ability to work in teams and collaborate with others");
            System.out.println("\t- A passion for gaming\n");

            Thread.sleep(1000);


            System.out.println("Do you meet these requirements?");
            String meet = scan.nextLine();

            if (!meet.contains("y")) {
                System.out.println("Sorry, you can not apply for this job!");
                System.exit(0);
            }
            
            else {
                System.out.println("Since we do not know if you are lying, we trust you to meet these requirements. If you do not, you will be fired!\n");
                System.out.print("Type in your address: ");
                String address = scan.nextLine();

                System.out.println("A check of $" + (150000/12) + " will be mailed to " + address + " you at the end of each month!");
            }
            
            
            break;
            case "c": 
            
            System.out.println("Here are the requirements for being a JAVA course designer: ");
            System.out.println("\t- You must know OOP");
            System.out.println("\t- You must know the basics");
            System.out.println("\t- You must be able to teach in a friendly way");
            System.out.println("\t- You must be able to create different challenges throughout the course\n");

            Thread.sleep(1000);

            System.out.println("\nDo you meet these requirements? ");
            String requirements = scan.nextLine();
            if (!requirements.contains("y")){
                System.out.println("Sorry, you are not able to apply for this job");
                System.exit(0);
            }

            else {
                System.out.println("\nSince we do not know if you are lying or not, you have to answer this question correct: \n");
                System.out.println("\tWhat is the error in this line of code? Type what is missing: ");
                System.out.println("System.out.println(''My name is bob'')");
                String answer = scan.nextLine();

                if (answer.equals("Semicolon") || answer.equals("semicolon") || answer.contains("-") || answer.equals("SemiColon")) {
                    System.out.println("Correct! You are hired!");
                    System.out.print("Type in your address: ");
                    String address = scan.nextLine();

                    System.out.println("A check of $" + (150000/12) + " will be mailed to " + address + " at the end of each month");
                } else {
                    System.out.println("Sorry, you are not applicable for this job");
                }
            }





            
            break;
            case "d": 
            
            System.out.println("\nHere are the requirements for becoming a Java Web Developer");
            System.out.println("\t- A bachelor's degree in Java");
            System.out.println("\t- Familiarity with Java");
            System.out.println("\t- You must know object oriented programming");
            System.out.println("\t- You must know Software Design and Architecture");

            Thread.sleep(1000);

            System.out.println("\nDo you meet these requirements? ");
            String b = scan.nextLine();

            if (!b.contains("y")) {
                System.out.println("Sorry, you cannot apply for this job");
                System.exit(0);
            }
            else {
                System.out.println("Since we do not know if you are lying or not, here is a question to prove if you are eligible:");
                System.out.println("\tWhat does 'www' stand for?");
                String answer = scan.nextLine();

                if (answer.equals("World Wide Web") || answer.equals("world wide web") || answer.equals("World wide web")|| answer.equals("world Wide web")|| answer.equals("World Wide web") || answer.equals("world wide Web") || answer.equals("World wide Web")|| answer.equals("world Wide Web")){
                    System.out.print("Congrats! You're hired! Please type in your address: ");
                    String address = scan.nextLine();

                    System.out.println("A check of $" + (125000/12) + " will be mailed to " + address + " at the end of each month");
                } else {
                    System.out.println("Sorry you are not applicable for this job.");
                }
            }


            break;
            case "e": 

            
            System.out.println("\nBasic Java Developer is creating apps somewhat like these, but with a little more logic. (for clarification)");
            Thread.sleep(1000);

            System.out.println("Here are the requirements for becoming a Basic Java Developer");
            System.out.println("\n\t- You must have if statements, loops, variables, arrays, and functions mastered");
            System.out.println("\t- You must know OOP to an intermediate extent");
            System.out.println("\t- You must be able to make apps like this simple and easy to understand");
            
            System.out.println("\nDo you meet these requirements?");
            String c = scan.nextLine();

            if (!c.contains("ye")){
                System.out.println("Sorry, you cannot apply for this job");
                System.exit(0);
            } 
            else {
                System.out.println("Since we do not know if you are lying or not here is a quick question: ");
                System.out.println("\tWhat is the problem in this loop? ");
                System.out.println("while (int i = 0; i < 2; i--");

                String error = scan.nextLine();

                if (error.contains("f") && error.contains("o") && error.contains("r")) {
                    System.out.println("Correct! You are hired!");
                    System.out.println("Type in your address: ");
                    String address = scan.nextLine();

                    System.out.println("A check of $" + (90000/12) + " will be mailed to " + address + " at the end of each month");
                }
            }



            break;
            case "f": break;
            case "g": break;
            case "h": break;
            case "i": break;
        }




        scan.close();
    }




    

}
