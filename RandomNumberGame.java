import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

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
         


        scan.close();
    }
}
