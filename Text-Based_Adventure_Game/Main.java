import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //System Objects
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        //Game Variables
        String[] enemies = {"Skeleton", "Zombie", "Warrior", "Assassin"};
        int maxEnemyHealth = 100;
        int enemyAttackDamage = 25;

        //Player Variables
        int health = 100;
        int attackDamage = 50;
        int numHealthPotions = 3;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50; //percentage

        boolean running = true;

        System.out.println("Welcome to the dungeon");
        
        GAME:
        while(running) {

            System.out.println("------------------------------------");

            int enemyHealth = random.nextInt(maxEnemyHealth);
            String enemy = enemies[random.nextInt(enemies.length)];
            System.out.println("\t# " + enemy + " has appeared! #\n");

            while(enemyHealth > 0) {
                System.out.println("\tYour HP: " + health);
                System.out.println("\t" + enemy + "'s HP: " + enemyHealth);
                System.out.println("\n\tWhat would you like to do?");
                System.out.println("\t1. Attack");
                System.out.println("\t2. Drink Health Potion");
                System.out.println("\t3. Run!");

                String input = scan.nextLine();
            }

        }






        scan.close();

    }
}
