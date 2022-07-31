import java.util.Scanner;

public class Banking {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("************************************");
        System.out.println("           JAVA BANKING             ");
        System.out.println("************************************");

        System.out.println("Hello, welcome to Java Banks, would you like to withdraw, deposit, or start a bank account?");
        String option = scan.nextLine();

        if (option.contains("w")) {
            System.out.println("How much would you like withdraw");
        }



        scan.close();
    }
}