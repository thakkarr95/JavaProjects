package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    // static means the value will hold for all objects and not just one object
    private static int costOfCourse = 600;
    private static int id = 1000;
    private String firstName;
    private String lastName;
    private int schoolYear;
    private String studentID;
    private String courses = "  ";
    private int tuitionBalance = 0;

    // Constructor: prompts user to enter name and year

    public Student() {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter student first name: ");
        // This takes String as an input from the user
        this.firstName = in.nextLine();

        System.out.print("Enter student last name: ");
        // This takes String as an input from the user
        this.lastName = in.nextLine();

        System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student school year: ");
        // This takes integer as an input from the user
        this.schoolYear = in.nextInt();

        setStudentID();

//        System.out.println(firstName + " " + lastName + " School Year: " + schoolYear + " " + studentID);

    }

    // Generate an id
    private void setStudentID() {
        // Grade level + ID
        this.studentID = this.schoolYear + "" + id;
        id++;

    }

    // Enroll in courses

    public void enroll() {

        String course = "";

        // Infinite loop is usually better if you want to take input from the user
        while (1 != 0) {

            System.out.print("Enter course to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            course = in.nextLine();

            if (course.toUpperCase().equals("Q")) {
                break;
            } else {

                this.courses = this.courses + course + "\n  ";
                this.tuitionBalance += costOfCourse;

            }

        }

//        System.out.println("Enrolled in: " + this.courses);
//        viewBalance();

    }

    // View balance and pay tuition

    public void viewBalance() {
        System.out.println("Your balance is: $" + this.tuitionBalance);
    }

    public void payTuition() {
        System.out.print("Total balance due is $" + this.tuitionBalance + ". Enter your payment: $");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        this.tuitionBalance -= payment;
        System.out.println("Thank you for your payment of $" + payment);
        viewBalance();
    }

    // Show status

    public String showInfo() {
        return "Name: " + firstName + " " + lastName + "\n" +
                "School Year: " + schoolYear + "\n" +
                "Student Id: " + studentID + "\n" +
                "Courses Enrolled:\n" + courses + "\n" +
                "Balance: $" + tuitionBalance;
    }


}
