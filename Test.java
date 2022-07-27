import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Welcome to the math test. This will test your math skills. You think you can get 10/10?");
        System.out.println("You may not use a calculator on this test. You can use pencil/pen and paper! :)");

        System.out.println("\n Question One: ");
        System.out.println("What is the square root of 49?");
        int questionOne = scan.nextInt();

        if (questionOne == 7){
        

            //Question Two if question One right
            System.out.println("\n Question Two: ");
            System.out.println("What is 2x + 24 = 6x + 20 (if you get a fraction put it in decimal form if it is -8/10 put -0.8)");
            double questionTwo = scan.nextDouble();

            //Question Two right
            if (questionTwo == -0.5){
                System.out.println("\n Question Three: ");
                System.out.println("If an item sells for $20 kilograms, how much does it sell per gram? ( put in decimals, if it is 3 cents put 0.03)");
                double questionThree = scan.nextDouble();

                if (questionThree == 0.02){
                    System.out.println("I have come to a prediction! You are in 11th grade or 12th!");
                }

                if (questionThree != 0.02){
                    System.out.println("I have come to a prediction! You are in 9th or 10th grade!");
                }
            }

            //Question Two wrong
            if (questionTwo != -0.5){
                System.out.println("\nQuestion Three: ");
                System.out.println("What is the LCM of 24 and 60?");
                int questionTwoWrong = scan.nextInt();

                if (questionTwoWrong == 120){
                    System.out.println("I have come to a prediction! You are in 6th or 7th grade!");
                }
            }
        }

        if (questionOne != 7){
            
            //Question Two if question One is not right
            System.out.println("\n Question Two");
            System.out.println("What is X if 2x = 24");
            int questionTwoOneWrong = scan.nextInt();

            //Question Two right if question one wrong
            if (questionTwoOneWrong == 12){
                System.out.println("\nQuestion Three: ");
                System.out.println("What is X if 2x + 12 = 24");
                int questionThreeifTwoRight = scan.nextInt();

                if (questionThreeifTwoRight == 6){
                    System.out.println("I have come to a prediction! You are in 6th or 7th grade!");
                }

                if (questionThreeifTwoRight != 6){
                    System.out.println("I have come to a prediction! You are in 6th grade!");
                }
            }

            //Question Two wrong after Question One wrong
            if (questionTwoOneWrong != 12) {
                System.out.println("\nQuestion Three: ");
                System.out.println("What is the LCM of 24 and 60?");
                int questionThreeAllWrong = scan.nextInt();

                if (questionThreeAllWrong == 120){
                    System.out.println("I have come to a prediction! You are in 5th grade!");
                }

                if (questionThreeAllWrong != 120){
                    System.out.println("I have come to a prediction! You are in 4th grade or below!!");
                }
            }
        }

        











































        scan.close();
    }
}