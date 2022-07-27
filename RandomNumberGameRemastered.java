import java.util.Scanner;

public class RandomNumberGameRemastered {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Old Code
        /*
        System.out.println("\nWelcome to the random number game. Lets go!");

        //Always remember to cast random number to int
        int randomNumber = (int) (Math.random() * 100);

        System.out.println("\nI am thinking of a random integer from 1 - 100 what is it?");
        int randomNumberAnswer = scan.nextInt();

        if (randomNumberAnswer > 100) {
            System.out.println("404: NOT VALID ANSWER");
        }

        if (randomNumber == 0) {
            randomNumber++;
        }

        else {
        

        int difference = (randomNumber - randomNumberAnswer);

        if (difference < 0) {
            difference = difference * -1;
        }

        if (randomNumberAnswer < randomNumber) {
            System.out.println("Oh, you guessed " + difference + " less! The number was " + randomNumber);
        }

        if (randomNumberAnswer > randomNumber) {
            System.out.println("Oh, you guessed " + difference + " higher! The number was " + randomNumber);
        }

        if (randomNumberAnswer == randomNumber) {
            System.out.println("Oh, you guessed it right!");
        }

    }
    */

            //Remastered Version
            System.out.println("Would you like to play?");
            String play = scan.nextLine();

            if (play.contains("y")){
            System.out.println("Welcome to the random number game! Lets go over the rules: ");
            System.out.println("\t- You choose the range of numbers.");
            System.out.println("\t- You guess until you get the numbers.");
            System.out.println("\t- There is no pattern! Don't waste your time trying to figure any pattern!\n");

            
            System.out.print("Type what the highest number you want to go to (if you want to do 1 - 100, type 100): ");
            int range = scan.nextInt();
            
            int randomNumber = (int) (Math.random() * range);
            randomNumber++;
            
            System.out.print("Ok.... I have a random number from 1 to " + range +  ", type your guess!: ");
            int guess = scan.nextInt();

            int userGuesses = 0;

            while (guess != randomNumber){
                System.out.print("You guessed wrong! Try again: ");
                guess = scan.nextInt();
                userGuesses++;
            
                if (guess <= 0) {
                    System.out.print("Error 313 number below range, try again: ");
                    guess = scan.nextInt();
                    userGuesses++;

                } else if (guess > range) {
                    System.out.print("Error 214 number above range, try again: ");
                    userGuesses++;
                } 
            }

            System.out.println("You guessed " + userGuesses + " times! ");

            System.out.print("But, You got it right!");
            
                
        

            scan.close();
        }   
    }
}
