import java.util.Scanner;

public class Memory {
    public static void main(String[] args) throws InterruptedException {

        int score = 0;

        Scanner scan = new Scanner(System.in);

        //Opening message
        System.out.print("Welcome to the memory game. Type anything to continue: ");
        scan.nextLine();

        System.out.println("This is a memory game it will:  ");
        System.out.println("\t- Ask you a few questions");
        System.out.println("\t- You have to answer them");
        System.out.println("\t- Provide your memory score on a scale from one to ten");


        //To-Start message
        System.out.print("Would you like to start? Type anything to confirm");
        scan.nextLine();

        //QuestionOne
        int random1 = randomNumber();
        int random2 = randomNumber();
        int random3 = randomNumber();

        System.out.println("Question One: (easy)");
        System.out.println("You have 3 seconds to memorize these three numbers: " );
        Thread.sleep(2000);
        System.out.println(random1 + " " + random2 + " " + random3);
        Thread.sleep(3000);

        for (int i = 0; i < 1000; i++) {
            System.out.println(randomNumber() + (randomNumber() * 13422345));
            Thread.sleep(25);
            
        }


        System.out.println("\nWhat were the three numbers? \n");

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();

        if(number1 != random1 || number2 != random2 || number3 != random3) {
            score += 0;
        } else {
            score += 3;
        }
        



        int RN = randomNumber();
        int RN1 = randomNumber();
        
        //Question Two

        System.out.println("\n\nQuestion Two (medium): ");
        System.out.println("You have 20 seconds to remeber this equation: ");
        Thread.sleep(1000);

        String equationOne = RN + "x + " + RN1 + "y";
        


    
        System.out.println(equationOne);
        
        Thread.sleep(20000);

        for (int i = 0; i < 1000; i++) {
            System.out.println(randomNumber() + "x * " + randomNumber() + randomNumber() + randomNumber() + " * " + randomNumber()); 
            Thread.sleep(25);
        }

        scan.nextLine();

        System.out.println("What was the first equation? Add space before each character unless the term has a coefficient.");
        String equationOneAnswer = scan.nextLine();

        

        if (!equationOneAnswer.equals(equationOne)) {
            score += 0;
        }   else {
            score += 3;
        }

        

        //Vars
        int numberRandom = randomNumber();
        int numberRandom1 = randomNumber();
        int numberRandom2 = randomNumber();
        int numberRandom3 = randomNumber();
        int numberRandom4 = randomNumber();
        int numberRandom5 = randomNumber();
        int numberRandom6 = randomNumber();
        int numberRandom7 = randomNumber();
        int numberRandom8 = randomNumber();

        //QuestionThree
        System.out.println("\n\nQuestion Three (hard): ");
        System.out.println("You have 45 seconds to remember the numbers on this board: ");
       
        int[][] board =  {
            {numberRandom, numberRandom1, numberRandom2},
            {numberRandom3, numberRandom4, numberRandom5},
            {numberRandom6, numberRandom7, numberRandom8}
        };

        Thread.sleep(1500);

        printBoard(board);

        Thread.sleep(45000);

        for (int i = 0; i < 100; i++) {
            int [][] j = {
                {randomNumber(), randomNumber(), randomNumber()},
                {randomNumber(), randomNumber(), randomNumber()},
                {randomNumber(), randomNumber(), randomNumber()}
            };
            printBoard(j);
            Thread.sleep(100);

        }

        System.out.println("\nWhat was the number on the top right corner of the board?");
        int topRight = scan.nextInt();

        System.out.println("What was the number on the bottom right corner of the board?");
        int bottomRight = scan.nextInt();

        System.out.println("What was the number in the middle of the board?");
        int middle = scan.nextInt();

        System.out.println("What was the number on the bottom left of the board?");
        int bottomLeft = scan.nextInt();

        if (topRight != numberRandom2 || bottomRight != numberRandom8 || middle != numberRandom4 || bottomLeft != numberRandom6){
           score += 0;
        } else {
            score += 4;
        }
        

        System.out.println("You scored a " + score + "/10");


        scan.close();
    }

    public static int randomNumber() {
        int random = (int) (Math.random() * 100);
        random++;

        return random;
    }

    public static void printBoard(int[][] board) {
        System.out.print("\n");
        for (int i = 0; i < board.length; i++) {
            System.out.print("\t");
            for (int j = 0; j < board[i].length; j++) {
                System.out.print(board[i][j]+ " ");
            }
            System.out.print("\n\n");
        }
    }

    


}
