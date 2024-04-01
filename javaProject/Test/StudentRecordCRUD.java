import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentRecordCRUD {
    private List<Student> students;

    public StudentRecordCRUD() {
        this.students = new ArrayList<>();
    }

    public void createStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name:");
        String name = scanner.nextLine();
        System.out.println("Enter student department");
        String department = scanner.nextLine();
        System.out.println("Enter student ID:");
        String id = scanner.nextLine();
        System.out.println("Enter student age:");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume newline character

        Student student = new Student(name, department,  id, age);
        students.add(student);
        System.out.println("Student created successfully.");
    }

    public void readStudents() {
        System.out.println("List of students:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void updateStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID to update:");
        String id = scanner.nextLine();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                System.out.println("Enter new name:");
                String name = scanner.nextLine();
                   System.out.println("Enter new department ");
                String department = scanner.nextLine();
                
                System.out.println("Enter new age:");
                int age = scanner.nextInt();
                scanner.nextLine(); // Consume newline character

                student.setName(name);
                student.setDepartment(department);
                student.setAge(age);
                System.out.println("Student updated successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public void deleteStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student ID to delete:");
        String id = scanner.nextLine();

        for (Student student : students) {
            if (student.getId().equals(id)) {
                students.remove(student);
                System.out.println("Student deleted successfully.");
                return;
            }
        }

        System.out.println("Student not found.");
    }

    public static void main(String[] args) {
        StudentRecordCRUD app = new StudentRecordCRUD();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Create Student");
            System.out.println("2. Read Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    app.createStudent();
                    break;
                case 2:
                    app.readStudents();
                    break;
                case 3:
                    app.updateStudent();
                    break;
                case 4:
                    app.deleteStudent();
                    break;
                case 5:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

class Student {
    private String name;
    private String department;
    private String id;
    private int age;

    public Student(String name, String id, int age) {
        this.name = name;
        this.daprtment = department;
        this.id = id;
        this.age = age;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getDepartment () {
        return department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                "department='" + department + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
