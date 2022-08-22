import java.util.Scanner;

public class RestaurantNew {
    public static void main(String[] args) {
        System.out.println("Welcome to the restaurant! Type 'options' to look at the options you have!");
        Scanner scan = new Scanner (System.in);
        String options = scan.nextLine();
        
        if (options.contains("o")) {
            System.out.println("Type the letter corresponding to the option you want to select: \n");

            //Options
            System.out.println("Look at the menu (a) ");
            System.out.println("Buy a drink (b) ");
            System.out.println("Buy a desert (c) ");
            System.out.println("Email us for any questions (d) ");
            String select = scan.nextLine();

            //Reactions for selecting each option
            switch (select) {
                case "a": 
                /* 
                //Main Course Variables
                double cheesePizza = 8.00;
                double pepperoniPizza = 7.50;
                double chickenPizza = 8.50;
                double pasta = 8.50;
                double macncheese = 10.50;
                double chickenByriani = 18.99;
                double muttinByriani = 20.00;
                double friedChicken = 10.00;
                double Cheeseburger = 3.00;
                double turekySandwich = 2.00;
                double chickenSandwich = 2.00;



                //Drinks Variables
                double cocaCola = 1.00;
                double Sprite = 1.00;
                double icedTea = 1.00;
                double Fanta = 1.00;
                double Pepsi = 1.00;
                double rootBeer = 1.00;
                double drPepper = 1.00;
                double Lemonade = 1.00;
                double water = 0;


                
                //Deserts Variables
                double iceCream = 1.00;
                double chocolate = 1.00;
                double frozenYogurt = 1.00;
                double plainCheescake = 1.00;
                double almondCheescake = 1.50;
                double strawberryCheescake= 1.70;
                double chocolateCake = 1.75;
                double vanillaCake = 1.75;
                */


                System.out.println("\nHere is the menu: ");
                
                System.out.println("Main Course: \n");
                System.out.println("Pizza (pepperoni) (type 'a')                         .....$8.00");
                System.out.println("Pizza (cheese) (type 'b')                            .....$7.50");
                System.out.println("Chicken Pizza (type 'c')                             .....$8.50");
                System.out.println("Pasta (type 'd')                                     .....$8.50");
                System.out.println("Mac'n Cheese (type 'e')                              .....$10.50");
                System.out.println("Chicken Byriani (type 'f')                           .....$18.99");
                System.out.println("Muttin Byriani (type 'g')                            .....$20.00");
                System.out.println("Fried Chicken (8pc) (type 'h')                       .....$10.00");
                System.out.println("Cheeseburger (type 'i')                              .....$3.00");
                System.out.println("Turkey Sandwich (type 'j')                           .....$2.00");
                System.out.println("Chicken Sandwich (type 'k')                          .....$2.00\n");
 
 
                System.out.println("Drinks: \n");
                System.out.println("Coca-Cola (type 'a')                                 .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Sprite (type 'b')                                    .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Iced Tea (type 'c')                                  .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Fanta (type 'd')                                     .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Pepsi (type 'e')                                     .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Root Beer (type 'f')                                 .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Dr Pepper (type 'g')                                 .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Lemonade (type 'h')                                  .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Water (type 'i')                                     .....FREE!\n");
 
 
                System.out.println("Deserts: ");
                System.out.println("Ice Cream (type 'a')                                 .....$1.00");
                System.out.println("Chocolate (1 bar) (type 'b')                         .....$1.00");
                System.out.println("Frozen Yogurt (type 'c')                             .....$1.00");
                System.out.println("Cheescake: plain (1 slice) (type 'd')                .....$1.00");
                System.out.println("Cheescake: almond (1 slice) (type 'e')               .....$1.50");
                System.out.println("Cheesecake: Strawberry (1 slice) (type 'f')          .....$1.75");
                System.out.println("Cake: chocolate (1 slice)  (type 'g')                .....$1.75");
                System.out.println("Cake: vanilla (1 slice) (type 'h')                   .....$1.75\n");
                
                
                //Main Course Amounts
                System.out.println("How many main courses do you want to order (max 4)? ");
                int mainCourseAmount = scan.nextInt();

                
                switch (mainCourseAmount) {
                    case 1:
                    ordersOne(); 
                    break;

                    case 2:
                    orderTwo();
                    break;

                    case 3:
                    orderThree();
                    break;

                    case 4: 
                    orderFour();
                    break;

                    default: System.out.println("You either did not type a valid answer, or went over 4 main course meals. You even might have types ZERO. Sorry, don't support those things.");
                }










 
                break;


                //Ordering Drinks Only
                case "b": 
                System.out.println("\nDrinks: \n");
                System.out.println("Coca-Cola (type 'a')                                 .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Sprite (type 'b')                                    .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Iced Tea (type 'c')                                  .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Fanta (type 'd')                                     .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Pepsi (type 'e')                                     .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Root Beer (type 'f')                                 .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Dr Pepper (type 'g')                                 .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Lemonade (type 'h')                                  .....$1.00 ($0.50 if you buy a main course)");
                System.out.println("Water (type 'i')                                     .....FREE!\n");

                orderDrinksOnly();
                
                break;

                //Ordering Deserts Only
                case "c":

                System.out.println("\nDeserts: \n");
                System.out.println("Ice Cream (type 'a')                                 .....$1.00");
                System.out.println("Chocolate (1 bar) (type 'b')                         .....$1.00");
                System.out.println("Frozen Yogurt (type 'c')                             .....$1.00");
                System.out.println("Cheescake: plain (1 slice) (type 'd')                .....$1.00");
                System.out.println("Cheescake: almond (1 slice) (type 'e')               .....$1.50");
                System.out.println("Cheesecake: Strawberry (1 slice) (type 'f')          .....$1.75");
                System.out.println("Cake: chocolate (1 slice)  (type 'g')                .....$1.75");
                System.out.println("Cake: vanilla (1 slice) (type 'h')                   .....$1.75\n");


                orderDesertsOnly();

                break;

                //Case for email
                case "d": 
                System.out.println("Email Here: support@therestaurant.com");
                break;
            }






        }

        scan.close();
    }

    

    //function for ordering 1 
    public static void ordersOne () {


    Scanner scan = new Scanner (System.in);

    //Sets the total amount
    double totalAmount = 0;

    //Main Course Variables
    double cheesePizza = 8.00;
    double pepperoniPizza = 7.50;
    double chickenPizza = 8.50;
    double pasta = 8.50;
    double macncheese = 10.50;
    double chickenByriani = 18.99;
    double muttinByriani = 20.00;
    double friedChicken = 10.00;
    double Cheeseburger = 3.00;
    double turkeySandwich = 2.00;
    double chickenSandwich = 2.00;



    //Drinks Variables
    double cocaCola = 1.00;
    double Sprite = 1.00;
    double icedTea = 1.00;
    double Fanta = 1.00;
    double Pepsi = 1.00;
    double rootBeer = 1.00;
    double drPepper = 1.00;
    double Lemonade = 1.00;
    double water = 0;


    
    //Deserts Variables
    double iceCream = 1.00;
    double chocolate = 1.00;
    double frozenYogurt = 1.00;
    double plainCheescake = 1.00;
    double almondCheescake = 1.50;
    double strawberryCheescake= 1.70;
    double chocolateCake = 1.75;
    double vanillaCake = 1.75;

    //Asking for menu
    System.out.println("What do you want to order? (type the corresponding letter to what you want)");
    String mainCourse = scan.nextLine();

    switch (mainCourse) {
        //Non-capitals
        case "a": totalAmount += cheesePizza; break;
        case "b": totalAmount += pepperoniPizza; break;
        case "c": totalAmount += chickenPizza;
        case "d": totalAmount += pasta; break;
        case "e": totalAmount += macncheese; break;
        case "f": totalAmount += chickenByriani; break;
        case "g": totalAmount += muttinByriani; break;
        case "h": totalAmount += friedChicken; break;
        case "i": totalAmount += Cheeseburger; break;
        case "j": totalAmount += turkeySandwich; break;
        case "k": totalAmount += chickenSandwich; break;

        //Capitals
        case "A": totalAmount += cheesePizza; break;
        case "B": totalAmount += pepperoniPizza; break;
        case "C": totalAmount += chickenPizza; break;
        case "D": totalAmount += pasta; break;
        case "E": totalAmount += macncheese; break;
        case "F": totalAmount += chickenByriani; break;
        case "G": totalAmount += muttinByriani; break;
        case "H": totalAmount += friedChicken; break;
        case "I": totalAmount += Cheeseburger; break;
        case "J": totalAmount += turkeySandwich; break;
        case "K": totalAmount += chickenSandwich; break;
    }

    System.out.println("Would you like a drink? ('yes' or 'no') (you can only get one drink): ");
    String drinkChoice = scan.nextLine();

    if (drinkChoice.contains("y")) {
        System.out.println("What is the drink you want? (type the corresponding letter to the drink you want): ");
        String drinkAmount = scan.nextLine();

        switch (drinkAmount) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
        }
    } 


    else {
        totalAmount += 0;
    }

    System.out.println("Would you like a desert? ('yes' or 'no') (you can only get one desert): ");
    String desertChoice = scan.nextLine();

    if (desertChoice.contains("y")) {
        System.out.println("What is the desert you want? (type the corresponding letter to the drink you want): ");
        String desertAmount = scan.nextLine();

        switch (desertAmount) {
               //Non-capitals
               case "a": totalAmount += iceCream; break;
               case "b": totalAmount += chocolate; break;
               case "c": totalAmount += frozenYogurt; break;
               case "d": totalAmount += plainCheescake; break;
               case "e": totalAmount += almondCheescake; break;
               case "f": totalAmount += strawberryCheescake; break;
               case "g": totalAmount += chocolateCake; break;
               case "h": totalAmount += vanillaCake; break;

           //Capitals
           
               case "A": totalAmount += iceCream; break;
               case "B": totalAmount += chocolate; break;
               case "C": totalAmount += frozenYogurt; break;
               case "D": totalAmount += plainCheescake; break;
               case "E": totalAmount += almondCheescake; break;
               case "F": totalAmount += strawberryCheescake; break;
               case "G": totalAmount += chocolateCake; break;
               case "H": totalAmount += vanillaCake;  break;
        }

        //Receipt
        System.out.println("Your total cost is $" + totalAmount);
        System.out.println("Please enter your address: ");
        String address = scan.nextLine();
        System.out.println("Please enter your phone number or email: ");
        String phoneOrEmail = scan.nextLine();
        System.out.println("\nThank you for your order! Your order will arrive to " + address + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail + " if needed. (International orders may take weeks)");
    } 





        scan.close();
    }



    //function for ordering 2
    public static void orderTwo() {
        Scanner scan = new Scanner (System.in);

        //Sets the total amount
        double totalAmount = 0;
    
        //Main Course Variables
        double cheesePizza = 8.00;
        double pepperoniPizza = 7.50;
        double chickenPizza = 8.50;
        double pasta = 8.50;
        double macncheese = 10.50;
        double chickenByriani = 18.99;
        double muttinByriani = 20.00;
        double friedChicken = 10.00;
        double Cheeseburger = 3.00;
        double turkeySandwich = 2.00;
        double chickenSandwich = 2.00;
    
    
    
        //Drinks Variables
        double cocaCola = 1.00;
        double Sprite = 1.00;
        double icedTea = 1.00;
        double Fanta = 1.00;
        double Pepsi = 1.00;
        double rootBeer = 1.00;
        double drPepper = 1.00;
        double Lemonade = 1.00;
        double water = 0;
    
    
        
        //Deserts Variables
        double iceCream = 1.00;
        double chocolate = 1.00;
        double frozenYogurt = 1.00;
        double plainCheescake = 1.00;
        double almondCheescake = 1.50;
        double strawberryCheescake= 1.70;
        double chocolateCake = 1.75;
        double vanillaCake = 1.75;









        //code starts
        System.out.println("What is the first main course that you want to order? (type the corresponding letter to the food you want)");
        String mainCourse = scan.nextLine();

        switch (mainCourse) {
        //Non-capitals
            case "a": totalAmount += cheesePizza; break;
            case "b": totalAmount += pepperoniPizza; break;
            case "c": totalAmount += chickenPizza;
            case "d": totalAmount += pasta; break;
            case "e": totalAmount += macncheese; break;
            case "f": totalAmount += chickenByriani; break;
            case "g": totalAmount += muttinByriani; break;
            case "h": totalAmount += friedChicken; break;
            case "i": totalAmount += Cheeseburger; break;
            case "j": totalAmount += turkeySandwich; break;
            case "k": totalAmount += chickenSandwich; break;

            //Capitals
            case "A": totalAmount += cheesePizza; break;
            case "B": totalAmount += pepperoniPizza; break;
            case "C": totalAmount += chickenPizza; break;
            case "D": totalAmount += pasta; break;
            case "E": totalAmount += macncheese; break;
            case "F": totalAmount += chickenByriani; break;
            case "G": totalAmount += muttinByriani; break;
            case "H": totalAmount += friedChicken; break;
            case "I": totalAmount += Cheeseburger; break;
            case "J": totalAmount += turkeySandwich; break;
            case "K": totalAmount += chickenSandwich; break;
    }

    System.out.println("What is the second main course that you want to order? (type the corresponding letter to the food you want)");
        String mainCourse2 = scan.nextLine();

        switch (mainCourse2) {
        //Non-capitals
            case "a": totalAmount += cheesePizza; break;
            case "b": totalAmount += pepperoniPizza; break;
            case "c": totalAmount += chickenPizza;
            case "d": totalAmount += pasta; break;
            case "e": totalAmount += macncheese; break;
            case "f": totalAmount += chickenByriani; break;
            case "g": totalAmount += muttinByriani; break;
            case "h": totalAmount += friedChicken; break;
            case "i": totalAmount += Cheeseburger; break;
            case "j": totalAmount += turkeySandwich; break;
            case "k": totalAmount += chickenSandwich; break;

            //Capitals
            case "A": totalAmount += cheesePizza; break;
            case "B": totalAmount += pepperoniPizza; break;
            case "C": totalAmount += chickenPizza; break;
            case "D": totalAmount += pasta; break;
            case "E": totalAmount += macncheese; break;
            case "F": totalAmount += chickenByriani; break;
            case "G": totalAmount += muttinByriani; break;
            case "H": totalAmount += friedChicken; break;
            case "I": totalAmount += Cheeseburger; break;
            case "J": totalAmount += turkeySandwich; break;
            case "K": totalAmount += chickenSandwich; break;
    }


    System.out.println("Would you like a drink ('yes' or 'no') ");
    String drinkChoice = scan.nextLine();


    
    if (drinkChoice.contains("y")) {
        //ASking how many drinks 
        System.out.println("How many drinks would you like? (max 2): ");
        int drinksAmount = scan.nextInt();

        switch (drinksAmount) {
            case 1:
            
            scan.nextLine();

            System.out.println("What is the drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink1 = scan.nextLine();

            switch (drink1) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }


            break;

            case 2:

            System.out.println("What is the first drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink2a = scan.nextLine();

            switch (drink2a) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }
            
            System.out.println("What is the second drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink2b = scan.nextLine();

            switch (drink2b) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }



            break;

        }

    }
    else {
        totalAmount += 0;
    }

    //Deserts: 
    System.out.println("Would you like a desert? ('yes' or 'no'): ");
    String desertChoice = scan.nextLine();
    
    if (desertChoice.contains("y")) {
        System.out.println("How many deserts would you like? (max 2)");
        int desertAmount = scan.nextInt();

        switch (desertAmount) {
            case 1:
            scan.nextLine();
            System.out.println("What is the desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice1 = scan.nextLine();

            switch (desertChoice1) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            //Receipt
            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail = scan.nextLine();
            System.out.println("\nThank you for your order! Your order will arrive to " + address + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail + " if needed. (International orders may take weeks)");

            break;

            case 2:
            scan.nextLine();

            System.out.println("What is the first desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice2a = scan.nextLine();

            switch (desertChoice2a) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            System.out.println("What is the second desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice2b = scan.nextLine();

            switch (desertChoice2b) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            //Receipt
            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address2 = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail2 = scan.nextLine();
                System.out.println("\nThank you for your order! Your order will arrive to " + address2 + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail2 + " if needed. (International orders may take weeks)");

            break;

        }
    }






    else {
            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail = scan.nextLine();
            System.out.println("\nThank you for your order! Your order will arrive to " + address + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail + " if needed. (International orders may take weeks)");
    }







        //SCAN CLOSING LINE
        scan.close();
    }


    //Function for ordering 3
    public static void orderThree() {
        Scanner scan = new Scanner (System.in);

        //Sets the total amount
        double totalAmount = 0;
    
        //Main Course Variables
        double cheesePizza = 8.00;
        double pepperoniPizza = 7.50;
        double chickenPizza = 8.50;
        double pasta = 8.50;
        double macncheese = 10.50;
        double chickenByriani = 18.99;
        double muttinByriani = 20.00;
        double friedChicken = 10.00;
        double Cheeseburger = 3.00;
        double turkeySandwich = 2.00;
        double chickenSandwich = 2.00;
    
    
    
        //Drinks Variables
        double cocaCola = 1.00;
        double Sprite = 1.00;
        double icedTea = 1.00;
        double Fanta = 1.00;
        double Pepsi = 1.00;
        double rootBeer = 1.00;
        double drPepper = 1.00;
        double Lemonade = 1.00;
        double water = 0;
    
    
        
        //Deserts Variables
        double iceCream = 1.00;
        double chocolate = 1.00;
        double frozenYogurt = 1.00;
        double plainCheescake = 1.00;
        double almondCheescake = 1.50;
        double strawberryCheescake= 1.70;
        double chocolateCake = 1.75;
        double vanillaCake = 1.75;









        //code starts
        System.out.println("What is the first main course that you want to order? (type the corresponding letter to the food you want)");
        String mainCourse = scan.nextLine();

        switch (mainCourse) {
        //Non-capitals
            case "a": totalAmount += cheesePizza; break;
            case "b": totalAmount += pepperoniPizza; break;
            case "c": totalAmount += chickenPizza;
            case "d": totalAmount += pasta; break;
            case "e": totalAmount += macncheese; break;
            case "f": totalAmount += chickenByriani; break;
            case "g": totalAmount += muttinByriani; break;
            case "h": totalAmount += friedChicken; break;
            case "i": totalAmount += Cheeseburger; break;
            case "j": totalAmount += turkeySandwich; break;
            case "k": totalAmount += chickenSandwich; break;

            //Capitals
            case "A": totalAmount += cheesePizza; break;
            case "B": totalAmount += pepperoniPizza; break;
            case "C": totalAmount += chickenPizza; break;
            case "D": totalAmount += pasta; break;
            case "E": totalAmount += macncheese; break;
            case "F": totalAmount += chickenByriani; break;
            case "G": totalAmount += muttinByriani; break;
            case "H": totalAmount += friedChicken; break;
            case "I": totalAmount += Cheeseburger; break;
            case "J": totalAmount += turkeySandwich; break;
            case "K": totalAmount += chickenSandwich; break;
    }

    System.out.println("What is the second main course that you want to order? (type the corresponding letter to the food you want)");
        String mainCourse2 = scan.nextLine();

        switch (mainCourse2) {
        //Non-capitals
            case "a": totalAmount += cheesePizza; break;
            case "b": totalAmount += pepperoniPizza; break;
            case "c": totalAmount += chickenPizza;
            case "d": totalAmount += pasta; break;
            case "e": totalAmount += macncheese; break;
            case "f": totalAmount += chickenByriani; break;
            case "g": totalAmount += muttinByriani; break;
            case "h": totalAmount += friedChicken; break;
            case "i": totalAmount += Cheeseburger; break;
            case "j": totalAmount += turkeySandwich; break;
            case "k": totalAmount += chickenSandwich; break;

            //Capitals
            case "A": totalAmount += cheesePizza; break;
            case "B": totalAmount += pepperoniPizza; break;
            case "C": totalAmount += chickenPizza; break;
            case "D": totalAmount += pasta; break;
            case "E": totalAmount += macncheese; break;
            case "F": totalAmount += chickenByriani; break;
            case "G": totalAmount += muttinByriani; break;
            case "H": totalAmount += friedChicken; break;
            case "I": totalAmount += Cheeseburger; break;
            case "J": totalAmount += turkeySandwich; break;
            case "K": totalAmount += chickenSandwich; break;
    }

    System.out.println("What is the third main course that you want to order? (type the corresponding letter to the food you want)");
        String mainCourse3 = scan.nextLine();

        switch (mainCourse3) {
        //Non-capitals
            case "a": totalAmount += cheesePizza; break;
            case "b": totalAmount += pepperoniPizza; break;
            case "c": totalAmount += chickenPizza;
            case "d": totalAmount += pasta; break;
            case "e": totalAmount += macncheese; break;
            case "f": totalAmount += chickenByriani; break;
            case "g": totalAmount += muttinByriani; break;
            case "h": totalAmount += friedChicken; break;
            case "i": totalAmount += Cheeseburger; break;
            case "j": totalAmount += turkeySandwich; break;
            case "k": totalAmount += chickenSandwich; break;

            //Capitals
            case "A": totalAmount += cheesePizza; break;
            case "B": totalAmount += pepperoniPizza; break;
            case "C": totalAmount += chickenPizza; break;
            case "D": totalAmount += pasta; break;
            case "E": totalAmount += macncheese; break;
            case "F": totalAmount += chickenByriani; break;
            case "G": totalAmount += muttinByriani; break;
            case "H": totalAmount += friedChicken; break;
            case "I": totalAmount += Cheeseburger; break;
            case "J": totalAmount += turkeySandwich; break;
            case "K": totalAmount += chickenSandwich; break;
    }

    System.out.println("Would you like a drink ('yes' or 'no') ");
    String drinkChoice = scan.nextLine();


    
    if (drinkChoice.contains("y")) {
        //ASking how many drinks 
        System.out.println("How many drinks would you like? (max 3): ");
        int drinksAmount = scan.nextInt();

        switch (drinksAmount) {
            case 1:
            
            scan.nextLine();

            System.out.println("What is the drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink1 = scan.nextLine();

            switch (drink1) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }


            break;

            case 2:

            System.out.println("What is the first drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink2a = scan.nextLine();

            switch (drink2a) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }
            
            System.out.println("What is the second drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink2b = scan.nextLine();

            switch (drink2b) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }



            break;

            case 3:

            System.out.println("What is the first drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink3a = scan.nextLine();

            switch (drink3a) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }

            System.out.println("What is the second drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink3b = scan.nextLine();

            switch (drink3b) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }

            System.out.println("What is the third drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink3c = scan.nextLine();

            switch (drink3c) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }




            break;
        }

    }

    else {
        totalAmount += 0;
    }

    //Deserts: 
    System.out.println("Would you like a desert? ('yes' or 'no'): ");
    String desertChoice = scan.nextLine();
    
    if (desertChoice.contains("y")) {
        System.out.println("How many deserts would you like? (max 3)");
        int desertAmount = scan.nextInt();

        switch (desertAmount) {
            case 1:
            scan.nextLine();
            System.out.println("What is the desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice1 = scan.nextLine();

            switch (desertChoice1) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            //Receipt
            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail = scan.nextLine();
            System.out.println("\nThank you for your order! Your order will arrive to " + address + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail + " if needed. (International orders may take weeks)");

            break;

            case 2:
            scan.nextLine();

            System.out.println("What is the first desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice2a = scan.nextLine();

            switch (desertChoice2a) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            System.out.println("What is the second desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice2b = scan.nextLine();

            switch (desertChoice2b) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            //Receipt
            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address2 = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail2 = scan.nextLine();
            System.out.println("\nThank you for your order! Your order will arrive to " + address2 + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail2 + " if needed. (International orders may take weeks)");

            break;

            case 3:
            scan.nextLine();


            System.out.println("What is the first desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice3a = scan.nextLine();

            switch (desertChoice3a) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            System.out.println("What is the second desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice3b = scan.nextLine();

            switch (desertChoice3b) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            System.out.println("What is the third desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice3c = scan.nextLine();

            switch (desertChoice3c) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            //Receipt
            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address3 = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail3 = scan.nextLine();
            System.out.println("\nThank you for your order! Your order will arrive to " + address3 + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail3 + " if needed. (International orders may take weeks)");

            break;
        }
    }






    else {
            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail = scan.nextLine();
            System.out.println("Please enter your credit card: ");
            System.out.println("\nThank you for your order! Your order will arrive to " + address + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail + " if needed. (International orders may take weeks)");
    }







        //SCAN CLOSING LINE
        scan.close();
    }



    //Function for ordering 4 
    public static void orderFour() {
         Scanner scan = new Scanner (System.in);

        //Sets the total amount
        double totalAmount = 0;
    
        //Main Course Variables
        double cheesePizza = 8.00;
        double pepperoniPizza = 7.50;
        double chickenPizza = 8.50;
        double pasta = 8.50;
        double macncheese = 10.50;
        double chickenByriani = 18.99;
        double muttinByriani = 20.00;
        double friedChicken = 10.00;
        double Cheeseburger = 3.00;
        double turkeySandwich = 2.00;
        double chickenSandwich = 2.00;
    
    
    
        //Drinks Variables
        double cocaCola = 1.00;
        double Sprite = 1.00;
        double icedTea = 1.00;
        double Fanta = 1.00;
        double Pepsi = 1.00;
        double rootBeer = 1.00;
        double drPepper = 1.00;
        double Lemonade = 1.00;
        double water = 0;
    
    
        
        //Deserts Variables
        double iceCream = 1.00;
        double chocolate = 1.00;
        double frozenYogurt = 1.00;
        double plainCheescake = 1.00;
        double almondCheescake = 1.50;
        double strawberryCheescake= 1.70;
        double chocolateCake = 1.75;
        double vanillaCake = 1.75;









        //code starts
        System.out.println("What is the first main course that you want to order? (type the corresponding letter to the food you want)");
        String mainCourse = scan.nextLine();

        switch (mainCourse) {
        //Non-capitals
            case "a": totalAmount += cheesePizza; break;
            case "b": totalAmount += pepperoniPizza; break;
            case "c": totalAmount += chickenPizza;
            case "d": totalAmount += pasta; break;
            case "e": totalAmount += macncheese; break;
            case "f": totalAmount += chickenByriani; break;
            case "g": totalAmount += muttinByriani; break;
            case "h": totalAmount += friedChicken; break;
            case "i": totalAmount += Cheeseburger; break;
            case "j": totalAmount += turkeySandwich; break;
            case "k": totalAmount += chickenSandwich; break;

            //Capitals
            case "A": totalAmount += cheesePizza; break;
            case "B": totalAmount += pepperoniPizza; break;
            case "C": totalAmount += chickenPizza; break;
            case "D": totalAmount += pasta; break;
            case "E": totalAmount += macncheese; break;
            case "F": totalAmount += chickenByriani; break;
            case "G": totalAmount += muttinByriani; break;
            case "H": totalAmount += friedChicken; break;
            case "I": totalAmount += Cheeseburger; break;
            case "J": totalAmount += turkeySandwich; break;
            case "K": totalAmount += chickenSandwich; break;
    }

    System.out.println("What is the second main course that you want to order? (type the corresponding letter to the food you want)");
        String mainCourse2 = scan.nextLine();

        switch (mainCourse2) {
        //Non-capitals
            case "a": totalAmount += cheesePizza; break;
            case "b": totalAmount += pepperoniPizza; break;
            case "c": totalAmount += chickenPizza;
            case "d": totalAmount += pasta; break;
            case "e": totalAmount += macncheese; break;
            case "f": totalAmount += chickenByriani; break;
            case "g": totalAmount += muttinByriani; break;
            case "h": totalAmount += friedChicken; break;
            case "i": totalAmount += Cheeseburger; break;
            case "j": totalAmount += turkeySandwich; break;
            case "k": totalAmount += chickenSandwich; break;

            //Capitals
            case "A": totalAmount += cheesePizza; break;
            case "B": totalAmount += pepperoniPizza; break;
            case "C": totalAmount += chickenPizza; break;
            case "D": totalAmount += pasta; break;
            case "E": totalAmount += macncheese; break;
            case "F": totalAmount += chickenByriani; break;
            case "G": totalAmount += muttinByriani; break;
            case "H": totalAmount += friedChicken; break;
            case "I": totalAmount += Cheeseburger; break;
            case "J": totalAmount += turkeySandwich; break;
            case "K": totalAmount += chickenSandwich; break;
    }

    System.out.println("What is the third main course that you want to order? (type the corresponding letter to the food you want)");
        String mainCourse3 = scan.nextLine();

        switch (mainCourse3) {
        //Non-capitals
            case "a": totalAmount += cheesePizza; break;
            case "b": totalAmount += pepperoniPizza; break;
            case "c": totalAmount += chickenPizza;
            case "d": totalAmount += pasta; break;
            case "e": totalAmount += macncheese; break;
            case "f": totalAmount += chickenByriani; break;
            case "g": totalAmount += muttinByriani; break;
            case "h": totalAmount += friedChicken; break;
            case "i": totalAmount += Cheeseburger; break;
            case "j": totalAmount += turkeySandwich; break;
            case "k": totalAmount += chickenSandwich; break;

            //Capitals
            case "A": totalAmount += cheesePizza; break;
            case "B": totalAmount += pepperoniPizza; break;
            case "C": totalAmount += chickenPizza; break;
            case "D": totalAmount += pasta; break;
            case "E": totalAmount += macncheese; break;
            case "F": totalAmount += chickenByriani; break;
            case "G": totalAmount += muttinByriani; break;
            case "H": totalAmount += friedChicken; break;
            case "I": totalAmount += Cheeseburger; break;
            case "J": totalAmount += turkeySandwich; break;
            case "K": totalAmount += chickenSandwich; break;
    }

    System.out.println("What is the fourth main course that you want to order? (type the corresponding letter to the food you want)");
        String mainCourse4 = scan.nextLine();

        switch (mainCourse4) {
        //Non-capitals
            case "a": totalAmount += cheesePizza; break;
            case "b": totalAmount += pepperoniPizza; break;
            case "c": totalAmount += chickenPizza;
            case "d": totalAmount += pasta; break;
            case "e": totalAmount += macncheese; break;
            case "f": totalAmount += chickenByriani; break;
            case "g": totalAmount += muttinByriani; break;
            case "h": totalAmount += friedChicken; break;
            case "i": totalAmount += Cheeseburger; break;
            case "j": totalAmount += turkeySandwich; break;
            case "k": totalAmount += chickenSandwich; break;

            //Capitals
            case "A": totalAmount += cheesePizza; break;
            case "B": totalAmount += pepperoniPizza; break;
            case "C": totalAmount += chickenPizza; break;
            case "D": totalAmount += pasta; break;
            case "E": totalAmount += macncheese; break;
            case "F": totalAmount += chickenByriani; break;
            case "G": totalAmount += muttinByriani; break;
            case "H": totalAmount += friedChicken; break;
            case "I": totalAmount += Cheeseburger; break;
            case "J": totalAmount += turkeySandwich; break;
            case "K": totalAmount += chickenSandwich; break;
    }

    System.out.println("Would you like a drink ('yes' or 'no') ");
    String drinkChoice = scan.nextLine();


    
    if (drinkChoice.contains("y")) {
        //ASking how many drinks 
        System.out.println("How many drinks would you like? (max 4): ");
        int drinksAmount = scan.nextInt();

        switch (drinksAmount) {
            case 1:
            
            scan.nextLine();

            System.out.println("What is the drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink1 = scan.nextLine();

            switch (drink1) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }


            break;

            case 2:

            System.out.println("What is the first drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink2a = scan.nextLine();

            switch (drink2a) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }
            
            System.out.println("What is the second drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink2b = scan.nextLine();

            switch (drink2b) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }



            break;

            case 3:

            System.out.println("What is the first drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink3a = scan.nextLine();

            switch (drink3a) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }

            System.out.println("What is the second drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink3b = scan.nextLine();

            switch (drink3b) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }

            System.out.println("What is the third drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink3c = scan.nextLine();

            switch (drink3c) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }


            case 4:

            scan.nextLine();

            System.out.println("What is the first drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink4a = scan.nextLine();

            switch (drink4a) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }

            System.out.println("What is the second drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink4b = scan.nextLine();

            switch (drink4b) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }

            System.out.println("What is the third drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink4c = scan.nextLine();

            switch (drink4c) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }

            System.out.println("What is the fourth drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink4d = scan.nextLine();

            switch (drink4d) {
                case "a": totalAmount += (cocaCola*.5); break;
                case "b": totalAmount += (Sprite*.5); break;
                case "c": totalAmount += (icedTea*.5); break;
                case "d": totalAmount += (Fanta*.5); break;
                case "e": totalAmount += (Pepsi*.5); break;
                case "f": totalAmount += (drPepper*.5); break;
                case "g": totalAmount += (rootBeer*.5); break;
                case "h": totalAmount += (Lemonade*.5); break;
                case "i": totalAmount += (water*.5); break;
                

                //Capitals
                case "A": totalAmount += (cocaCola*.5); break;
                case "B": totalAmount += (Sprite*.5); break;
                case "C": totalAmount += (icedTea*.5); break;
                case "D": totalAmount += (Fanta*.5); break;
                case "E": totalAmount += (Pepsi*.5); break;
                case "F": totalAmount += (drPepper*.5); break;
                case "G": totalAmount += (rootBeer*.5); break;
                case "H": totalAmount += (Lemonade*.5); break;
                case "I": totalAmount += (water*.5); break;
            }
        }

    }
    
    else {
        totalAmount += 0;
    }

    //Deserts: 
    System.out.println("Would you like a desert? ('yes' or 'no'): ");
    String desertChoice = scan.nextLine();
    
    if (desertChoice.contains("y")) {
        System.out.println("How many deserts would you like? (max 4)");
        int desertAmount = scan.nextInt();

        switch (desertAmount) {
            case 1:
            scan.nextLine();
            System.out.println("What is the desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice1 = scan.nextLine();

            switch (desertChoice1) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            //Receipt
            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail = scan.nextLine();
            System.out.println("\nThank you for your order! Your order will arrive to " + address + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail + " if needed. (International orders may take weeks)");

            break;

            case 2:
            scan.nextLine();

            System.out.println("What is the first desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice2a = scan.nextLine();

            switch (desertChoice2a) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            System.out.println("What is the second desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice2b = scan.nextLine();

            switch (desertChoice2b) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            //Receipt
            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address2 = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail2 = scan.nextLine();
            System.out.println("\nThank you for your order! Your order will arrive to " + address2 + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail2 + " if needed. (International orders may take weeks)");

            break;

            case 3:
            scan.nextLine();


            System.out.println("What is the first desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice3a = scan.nextLine();

            switch (desertChoice3a) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            System.out.println("What is the second desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice3b = scan.nextLine();

            switch (desertChoice3b) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            System.out.println("What is the third desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice3c = scan.nextLine();

            switch (desertChoice3c) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            //Receipt
            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address3 = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail3 = scan.nextLine();
            System.out.println("\nThank you for your order! Your order will arrive to " + address3 + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail3 + " if needed. (International orders may take weeks)");

            break;


            case 4:
            scan.nextLine();


            System.out.println("What is the first desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice4a = scan.nextLine();

            switch (desertChoice4a) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }



            System.out.println("What is the second desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice4b = scan.nextLine();

            switch (desertChoice4b) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }



            System.out.println("What is the third desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice4c = scan.nextLine();

            switch (desertChoice4c) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }



            System.out.println("What is the fourth desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice4d = scan.nextLine();

            switch (desertChoice4d) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address4 = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail4 = scan.nextLine();

            System.out.println("\nThank you for your order! Your order will arrive to " + address4 + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail4 + " if needed. (International orders may take weeks)");
        }

        
    }






    else {
            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail = scan.nextLine();
            System.out.println("\nThank you for your order! Your order will arrive to " + address + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail + " if needed. (International orders may take weeks)");
    }







        //SCAN CLOSING LINE
        scan.close();
    }




    //Function for drinks
    public static void orderDrinksOnly() {

        //Drinks Variables
        double cocaCola = 1.00;
        double Sprite = 1.00;
        double icedTea = 1.00;
        double Fanta = 1.00;
        double Pepsi = 1.00;
        double rootBeer = 1.00;
        double drPepper = 1.00;
        double Lemonade = 1.00;
        double water = 0;

        Scanner scan = new Scanner (System.in);
        double totalAmount = 0;
        System.out.println("How many drinks would you like? (max 4): ");
        int drinksAmount = scan.nextInt();

        switch (drinksAmount) {
            case 1:
            
            scan.nextLine();

            System.out.println("What is the drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink1 = scan.nextLine();

            switch (drink1) {
                case "a": totalAmount += cocaCola; break;
                case "b": totalAmount += Sprite; break;
                case "c": totalAmount += icedTea; break;
                case "d": totalAmount += Fanta; break;
                case "e": totalAmount += Pepsi; break;
                case "f": totalAmount += drPepper; break;
                case "g": totalAmount += rootBeer; break;
                case "h": totalAmount += Lemonade; break;
                case "i": totalAmount += water; break;
                

                //Capitals
                case "A": totalAmount += cocaCola; break;
                case "B": totalAmount += Sprite; break;
                case "C": totalAmount += icedTea; break;
                case "D": totalAmount += Fanta; break;
                case "E": totalAmount += Pepsi; break;
                case "F": totalAmount += drPepper; break;
                case "G": totalAmount += rootBeer; break;
                case "H": totalAmount += Lemonade; break;
                case "I": totalAmount += water; break;
            }


            break;

            case 2:

            System.out.println("What is the first drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink2a = scan.nextLine();

            switch (drink2a) {
                case "a": totalAmount += cocaCola; break;
                case "b": totalAmount += Sprite; break;
                case "c": totalAmount += icedTea; break;
                case "d": totalAmount += Fanta; break;
                case "e": totalAmount += Pepsi; break;
                case "f": totalAmount += drPepper; break;
                case "g": totalAmount += rootBeer; break;
                case "h": totalAmount += Lemonade; break;
                case "i": totalAmount += water; break;
                

                //Capitals
                case "A": totalAmount += cocaCola; break;
                case "B": totalAmount += Sprite; break;
                case "C": totalAmount += icedTea; break;
                case "D": totalAmount += Fanta; break;
                case "E": totalAmount += Pepsi; break;
                case "F": totalAmount += drPepper; break;
                case "G": totalAmount += rootBeer; break;
                case "H": totalAmount += Lemonade; break;
                case "I": totalAmount += water; break;
            }
            
            System.out.println("What is the second drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink2b = scan.nextLine();

            switch (drink2b) {
                case "a": totalAmount += cocaCola; break;
                case "b": totalAmount += Sprite; break;
                case "c": totalAmount += icedTea; break;
                case "d": totalAmount += Fanta; break;
                case "e": totalAmount += Pepsi; break;
                case "f": totalAmount += drPepper; break;
                case "g": totalAmount += rootBeer; break;
                case "h": totalAmount += Lemonade; break;
                case "i": totalAmount += water; break;
                

                //Capitals
                case "A": totalAmount += cocaCola; break;
                case "B": totalAmount += Sprite; break;
                case "C": totalAmount += icedTea; break;
                case "D": totalAmount += Fanta; break;
                case "E": totalAmount += Pepsi; break;
                case "F": totalAmount += drPepper; break;
                case "G": totalAmount += rootBeer; break;
                case "H": totalAmount += Lemonade; break;
                case "I": totalAmount += water; break;
            }



            break;

            case 3:

            System.out.println("What is the first drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink3a = scan.nextLine();

            switch (drink3a) {
                case "a": totalAmount += cocaCola; break;
                case "b": totalAmount += Sprite; break;
                case "c": totalAmount += icedTea; break;
                case "d": totalAmount += Fanta; break;
                case "e": totalAmount += Pepsi; break;
                case "f": totalAmount += drPepper; break;
                case "g": totalAmount += rootBeer; break;
                case "h": totalAmount += Lemonade; break;
                case "i": totalAmount += water; break;
                

                //Capitals
                case "A": totalAmount += cocaCola; break;
                case "B": totalAmount += Sprite; break;
                case "C": totalAmount += icedTea; break;
                case "D": totalAmount += Fanta; break;
                case "E": totalAmount += Pepsi; break;
                case "F": totalAmount += drPepper; break;
                case "G": totalAmount += rootBeer; break;
                case "H": totalAmount += Lemonade; break;
                case "I": totalAmount += water; break;
            }

            System.out.println("What is the second drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink3b = scan.nextLine();

            switch (drink3b) {
                case "a": totalAmount += cocaCola; break;
                case "b": totalAmount += Sprite; break;
                case "c": totalAmount += icedTea; break;
                case "d": totalAmount += Fanta; break;
                case "e": totalAmount += Pepsi; break;
                case "f": totalAmount += drPepper; break;
                case "g": totalAmount += rootBeer; break;
                case "h": totalAmount += Lemonade; break;
                case "i": totalAmount += water; break;
                

                //Capitals
                case "A": totalAmount += cocaCola; break;
                case "B": totalAmount += Sprite; break;
                case "C": totalAmount += icedTea; break;
                case "D": totalAmount += Fanta; break;
                case "E": totalAmount += Pepsi; break;
                case "F": totalAmount += drPepper; break;
                case "G": totalAmount += rootBeer; break;
                case "H": totalAmount += Lemonade; break;
                case "I": totalAmount += water; break;
            }

            System.out.println("What is the third drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink3c = scan.nextLine();

            switch (drink3c) {
                case "a": totalAmount += cocaCola; break;
                case "b": totalAmount += Sprite; break;
                case "c": totalAmount += icedTea; break;
                case "d": totalAmount += Fanta; break;
                case "e": totalAmount += Pepsi; break;
                case "f": totalAmount += drPepper; break;
                case "g": totalAmount += rootBeer; break;
                case "h": totalAmount += Lemonade; break;
                case "i": totalAmount += water; break;
                

                //Capitals
                case "A": totalAmount += cocaCola; break;
                case "B": totalAmount += Sprite; break;
                case "C": totalAmount += icedTea; break;
                case "D": totalAmount += Fanta; break;
                case "E": totalAmount += Pepsi; break;
                case "F": totalAmount += drPepper; break;
                case "G": totalAmount += rootBeer; break;
                case "H": totalAmount += Lemonade; break;
                case "I": totalAmount += water; break;
            }


            case 4:

            scan.nextLine();

            System.out.println("What is the first drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink4a = scan.nextLine();

            switch (drink4a) {
                case "a": totalAmount += cocaCola; break;
                case "b": totalAmount += Sprite; break;
                case "c": totalAmount += icedTea; break;
                case "d": totalAmount += Fanta; break;
                case "e": totalAmount += Pepsi; break;
                case "f": totalAmount += drPepper; break;
                case "g": totalAmount += rootBeer; break;
                case "h": totalAmount += Lemonade; break;
                case "i": totalAmount += water; break;
                

                //Capitals
                case "A": totalAmount += cocaCola; break;
                case "B": totalAmount += Sprite; break;
                case "C": totalAmount += icedTea; break;
                case "D": totalAmount += Fanta; break;
                case "E": totalAmount += Pepsi; break;
                case "F": totalAmount += drPepper; break;
                case "G": totalAmount += rootBeer; break;
                case "H": totalAmount += Lemonade; break;
                case "I": totalAmount += water; break;
            }

            System.out.println("What is the second drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink4b = scan.nextLine();

            switch (drink4b) {
                case "a": totalAmount += cocaCola; break;
                case "b": totalAmount += Sprite; break;
                case "c": totalAmount += icedTea; break;
                case "d": totalAmount += Fanta; break;
                case "e": totalAmount += Pepsi; break;
                case "f": totalAmount += drPepper; break;
                case "g": totalAmount += rootBeer; break;
                case "h": totalAmount += Lemonade; break;
                case "i": totalAmount += water; break;
                

                //Capitals
                case "A": totalAmount += cocaCola; break;
                case "B": totalAmount += Sprite; break;
                case "C": totalAmount += icedTea; break;
                case "D": totalAmount += Fanta; break;
                case "E": totalAmount += Pepsi; break;
                case "F": totalAmount += drPepper; break;
                case "G": totalAmount += rootBeer; break;
                case "H": totalAmount += Lemonade; break;
                case "I": totalAmount += water; break;
            }

            System.out.println("What is the third drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink4c = scan.nextLine();

            switch (drink4c) {
                case "a": totalAmount += cocaCola; break;
                case "b": totalAmount += Sprite; break;
                case "c": totalAmount += icedTea; break;
                case "d": totalAmount += Fanta; break;
                case "e": totalAmount += Pepsi; break;
                case "f": totalAmount += drPepper; break;
                case "g": totalAmount += rootBeer; break;
                case "h": totalAmount += Lemonade; break;
                case "i": totalAmount += water; break;
                

                //Capitals
                case "A": totalAmount += cocaCola; break;
                case "B": totalAmount += Sprite; break;
                case "C": totalAmount += icedTea; break;
                case "D": totalAmount += Fanta; break;
                case "E": totalAmount += Pepsi; break;
                case "F": totalAmount += drPepper; break;
                case "G": totalAmount += rootBeer; break;
                case "H": totalAmount += Lemonade; break;
                case "I": totalAmount += water; break;
            }

            System.out.println("What is the fourth drink you would like? (type the corresponding letter to the drink you want) "); 
            String drink4d = scan.nextLine();

            switch (drink4d) {
                case "a": totalAmount += cocaCola; break;
                case "b": totalAmount += Sprite; break;
                case "c": totalAmount += icedTea; break;
                case "d": totalAmount += Fanta; break;
                case "e": totalAmount += Pepsi; break;
                case "f": totalAmount += drPepper; break;
                case "g": totalAmount += rootBeer; break;
                case "h": totalAmount += Lemonade; break;
                case "i": totalAmount += water; break;
                

                //Capitals
                case "A": totalAmount += cocaCola; break;
                case "B": totalAmount += Sprite; break;
                case "C": totalAmount += icedTea; break;
                case "D": totalAmount += Fanta; break;
                case "E": totalAmount += Pepsi; break;
                case "F": totalAmount += drPepper; break;
                case "G": totalAmount += rootBeer; break;
                case "H": totalAmount += Lemonade; break;
                case "I": totalAmount += water; break;
            }


            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail = scan.nextLine();
            System.out.println("\nThank you for your order! Your order will arrive to " + address + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail + " if needed. (International orders may take weeks)");
            
            scan.close();
    }
}


    //Function for deserts
    public static void orderDesertsOnly() {

        //Deserts Variables
        double iceCream = 1.00;
        double chocolate = 1.00;
        double frozenYogurt = 1.00;
        double plainCheescake = 1.00;
        double almondCheescake = 1.50;
        double strawberryCheescake= 1.70;
        double chocolateCake = 1.75;
        double vanillaCake = 1.75;

        double totalAmount = 0;
        Scanner scan = new Scanner(System.in);




        System.out.println("How many deserts would you like? (max 4)");
        int desertAmount = scan.nextInt();

        switch (desertAmount) {
            case 1:
            scan.nextLine();
            System.out.println("What is the desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice1 = scan.nextLine();

            switch (desertChoice1) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            //Receipt
            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail = scan.nextLine();
            System.out.println("\nThank you for your order! Your order will arrive to " + address + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail + " if needed. (International orders may take weeks)");

            break;

            case 2:
            scan.nextLine();

            System.out.println("What is the first desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice2a = scan.nextLine();

            switch (desertChoice2a) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            System.out.println("What is the second desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice2b = scan.nextLine();

            switch (desertChoice2b) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            //Receipt
            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address2 = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail2 = scan.nextLine();
             System.out.println("\nThank you for your order! Your order will arrive to " + address2 + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail2 + " if needed. (International orders may take weeks)");

            break;

            case 3:
            scan.nextLine();


            System.out.println("What is the first desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice3a = scan.nextLine();

            switch (desertChoice3a) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            System.out.println("What is the second desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice3b = scan.nextLine();

            switch (desertChoice3b) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            System.out.println("What is the third desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice3c = scan.nextLine();

            switch (desertChoice3c) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            //Receipt
            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address3 = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail3 = scan.nextLine();
            System.out.println("\nThank you for your order! Your order will arrive to " + address3 + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail3 + " if needed. (International orders may take weeks)");

            break;


            case 4:
            scan.nextLine();


            System.out.println("What is the first desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice4a = scan.nextLine();

            switch (desertChoice4a) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }



            System.out.println("What is the second desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice4b = scan.nextLine();

            switch (desertChoice4b) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }



            System.out.println("What is the third desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice4c = scan.nextLine();

            switch (desertChoice4c) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }



            System.out.println("What is the fourth desert you would like? (type the corresponding letter next to the desert you want): ");
            String desertChoice4d = scan.nextLine();

            switch (desertChoice4d) {
                //Non-capitals
                case "a": totalAmount += iceCream; break;
                case "b": totalAmount += chocolate; break;
                case "c": totalAmount += frozenYogurt; break;
                case "d": totalAmount += plainCheescake; break;
                case "e": totalAmount += almondCheescake; break;
                case "f": totalAmount += strawberryCheescake; break;
                case "g": totalAmount += chocolateCake; break;
                case "h": totalAmount += vanillaCake; break;

            //Capitals
            
                case "A": totalAmount += iceCream; break;
                case "B": totalAmount += chocolate; break;
                case "C": totalAmount += frozenYogurt; break;
                case "D": totalAmount += plainCheescake; break;
                case "E": totalAmount += almondCheescake; break;
                case "F": totalAmount += strawberryCheescake; break;
                case "G": totalAmount += chocolateCake; break;
                case "H": totalAmount += vanillaCake;  break;
            }

            System.out.println("Your total cost is $" + totalAmount);
            System.out.println("Please enter your address: ");
            String address4 = scan.nextLine();
            System.out.println("Please enter your phone number or email: ");
            String phoneOrEmail4 = scan.nextLine();
            System.out.println("\nThank you for your order! Your order will arrive to " + address4 + " in 10 - 30 minutes. We will contact you at " + phoneOrEmail4 + " if needed. (International orders may take weeks)");
        }





        scan.close();
    }


//FULL CODE ENDING DO NOT MOVE
}

