package week3Curriculum.classExercise1;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // Create an array of 5 students
        Student[] students = new Student[] {
                new Student(1001, "Alice", "Johnson", "2005-04-12", "Female", 19),
                new Student(1002, "Bob", "Smith", "2004-06-23", "Male", 20),
                new Student(1003, "Carol", "White", "2006-01-15", "Female", 18),
                new Student(1004, "David", "Brown", "2005-11-03", "Male", 19),
                new Student(1005, "Eva", "Taylor", "2003-09-30", "Female", 21)
        };

        // Get Desktop path (cross-platform)
        String desktopPath = System.getProperty("user.home") + "/Desktop/students.csv";

        try (FileWriter writer = new FileWriter(desktopPath)) {
            // Write CSV header
            writer.write("AdmissionNumber,FirstName,LastName,DateOfBirth,Gender,Age\n");

            // Write student data
            for (Student student : students) {
                writer.write(student.toString() + "\n");
            }

            System.out.println("Student data has been written into the CSV file successfully.");
            System.out.println("Check your desktop for: students.csv");

        } catch (IOException e) {
            System.err.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
