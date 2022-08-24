package studentDatebase;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses;
    private int tuitionBalance;
    private static int costOfCourse = 600;
    private static int id = 1;

    // Constructor with username & year
    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = in.nextLine();
        System.out.println("Enter student last name: ");
        this.lastName = in.nextLine();

        System.out.println("Enter student grade level 1-4: ");
        this.gradeYear = in.nextInt();

        

        // Increase ID number by one
        id++;

        // Create new student ID
        setID();

        System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
    }

    // Generate unique ID
    private void setID(){
        // Grade Level + ID
       this.studentID = gradeYear + "" + id;
    }

    // Enroll in courses

    // Check current balance

    // Pay Tuition

    // Show status
    
}
