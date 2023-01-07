import java.util.Scanner;

public class Student {
    private String firstName;
        private String lastName;
        private int gradeYear;
        private int studentID;
        private String courses;
        private int tuitionBalance;
        private static int costOfCourse = 600;
        private static int id = 1001;
    // Constructor: prompt user to enter student's name and year
    public Student() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student first name: ");
        this.firstName = scan.nextLine();

        System.out.println("Enter Student last name: ");
        this.lastName = scan.nextLine();

        System.out.println("Enter Student class level:1\n - for Freshmen\n2 - for Sophmore\n3 - for Junior\n4 - for Senior\n");
        this.gradeYear = scan.nextInt();

        System.out.println(firstName + " " + lastName + " " + gradeYear);
    }
    // Generate an ID

    // Enroll in courses

    // View balance 

    // Pay tuition

    // Show status
}
