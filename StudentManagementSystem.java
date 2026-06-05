import java.util.*;

class Student {
    int rollNo;
    String name;
    float marks;

    Student(int rollNo,String name,float marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        int choice=0;

         while (choice != 5) {
            System.out.println("\nSTUDENT MANAGEMENT SYSTEM");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Roll No: ");
                    int roll = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    float marks = sc.nextFloat();

                    students.add(new Student(roll, name, marks));
                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    if (students.isEmpty()) {
                        System.out.println("No Students Found.");
                    } else {
                        for (int i= 0; i < students.size(); i++) {
                            students.get(i).display();
                        }
                    }
                    break;

                case 3:
                    System.out.print("Enter Roll No. to Search: ");
                    int searchRoll = sc.nextInt();
                    int i;
                    for (i=0; i < students.size(); i++) {
                    if (students.get(i).rollNo == searchRoll) {
                            System.out.println("Student Found:");
                            students.get(i).display();
                            break;
                        }
                    }
                        if (i==students.size()) {
                            System.out.println("Student Not Found.");
                        }
                        break;


                case 4:
                    System.out.print("Enter Roll No. to Delete: ");
                    int deleteRoll = sc.nextInt();
                    int j;


                    for (j = 0; j < students.size(); j++) {
                        if (students.get(j).rollNo == deleteRoll) {
                            students.remove(j);
                            System.out.println("Student Deleted Successfully!");
                            break;
                        }
                    }

                    if (j==students.size()) {
                       System.out.println("Student Not Found.");
                    }
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        }

        sc.close();
    }
}







