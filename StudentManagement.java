package VERICENCE;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Student> students = new ArrayList<>();

        int choice;

        do {

            System.out.println("\n1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Delete Student");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    System.out.print("Enter Student ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();

                    System.out.print("Enter Contact Number: ");
                    String contactNo = sc.nextLine();

                    System.out.print("Enter Class: ");
                    String stdClass = sc.nextLine();

                    Student s = new Student(
                            id,
                            name,
                            age,
                            address,
                            contactNo,
                            stdClass);

                    students.add(s);

                    System.out.println("Student Added Successfully");
                    break;

                case 2:

                    System.out.println("\nStudent List:");

                    if (students.isEmpty()) {
                        System.out.println("No Students Found");
                    } else {

                        for (Student student : students) {
                            System.out.println(student);
                        }
                    }

                    break;

                case 3:

                    System.out.print("Enter Student ID to Delete: ");
                    int deleteId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < students.size(); i++) {

                        if (students.get(i).stdId == deleteId) {

                            students.remove(i);

                            System.out.println(
                                    "Student Deleted Successfully");

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student Not Found");
                    }

                    break;

                case 4:

                    System.out.println("Thank You");
                    break;

                default:

                    System.out.println("Invalid Choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
