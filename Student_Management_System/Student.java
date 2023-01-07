import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class Student {
    private String firstName;
        private String lastName;
        private String  gradeYear;
        private String studentID;
        private String courses = null;
        private int tuitionBalance;
        private static int costOfCourse = -600;
        private static int id = 1000;


    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student first name: ");
        this.firstName = scan.nextLine();

        System.out.println("Enter Student last name: ");
        this.lastName = scan.nextLine();

        System.out.println("Enter Student class level:\nFreshmen\nSophmore\nJunior\nSenior\n");
        this.gradeYear = scan.nextLine();

        setStudentID();

        System.out.println(firstName + " " + lastName + ", " + gradeYear + " " + studentID);

       scan.close();
    }
    // Generate an ID
    private void setStudentID() {
        // Grade Level + ID
        id++;
        this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses
    public void enroll() {
        do {
            System.out.println("Enter course to enroll (0 to quit): ");
            Scanner scan = new Scanner(System.in);
            String course = scan.nextLine();

            if (!course.equals("Q") || !course.equals("q")) {
                courses = course + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            }
            else { 
                break; 
            }
                scan.close();
        }    while (1 != 0);
        

        System.out.println("ENROLLED IN: " + courses);
        
    }

    // View balance 
    public void viewBalance() {
        System.out.println("Your balance is: $" + tuitionBalance);
    }

    // Pay tuition
    public void payTuition () {
        viewBalance();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your payment amount: $");
        int payment = scan.nextInt();
        tuitionBalance = tuitionBalance + payment;
        System.out.println("Thank you for your payment $" + payment);
        viewBalance();

        scan.close();
    }



    // Show status
}
