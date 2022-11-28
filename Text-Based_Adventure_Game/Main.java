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
                if (input.equals("1")) {
                    int damageDealt = random.nextInt(attackDamage);
                    int damageTaken = random.nextInt(enemyAttackDamage);

                    enemyHealth -= damageDealt;
                    health -= damageTaken;

                    System.out.println("\t> You strike the " + enemy + " for " + damageDealt + " damage.");
                    System.out.println("\t> You receive " + damageTaken + " in retaliation!");

                    if (health < 1) {
                        System.out.println("\t> You have taken too much damage, you are to week to go on.");
                        break;
                    }

                } else if (input.equals("2")) {
                    if (numHealthPotions > 0) {
                        health += healthPotionHealAmount;
                        numHealthPotions --;
                        System.out.println("\t> You drink a health potion, healing yourself for " + healthPotionHealAmount + "." 
                            + "\n\tYou now have " + health + " HP."
                            + "\n\tYou now have " + numHealthPotions + " remaining.\n");
                    } else {
                        System.out.println("\t> You have no health potions left! Defeat the enemy for a chance to win a health potion!");
                    }

                } else if (input.equals("3")) {
                    System.out.println("/tYou run away from the " + enemy + "!");
                    continue GAME;
                } else {
                    System.out.println("\tInvalid Command!");
                }
            }

            if (health < 1) {
                System.out.println("You limp out of the dungeon, weak from battle");
                break;
            }

            System.out.println("------------------------------------");
            System.out.println(" # " + enemy + " was defeated! # ");
            System.out.println(" # You have " + health + " HP left. #");
            if (random.nextInt(100) < healthPotionDropChance) {
                numHealthPotions++;
                System.out.println(" # The " + enemy + " dropped a health potion! #");
                System.out.println(" # You now have " + numHealthPotions + " health potion(s). #");
            }
            System.out.println("------------------------------------");
            System.out.println("What would you like to do now?");
            System.out.println("1. Continue Fighting");
            System.out.println("2. Exit Dungeon");

            String input = scan.nextLine();

            while (!input.equals("1") && !input.equals("2")) {
                System.out.println("Invalid Command");
                input = scan.nextLine();
            }

            if (input.equals("1")) {
                System.out.println("You continue on your adventure!");
            } else if (input.equals("2")) {
                System.out.println("You exit the dungeon, successful from your adventures");
                break;
            }

        }
        System.out.println("------------------------------------");
        System.out.println("# Thanks for playing! #");
        System.exit(0);



        scan.close();

    }
}
