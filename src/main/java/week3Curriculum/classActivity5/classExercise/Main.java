package week3Curriculum.classActivity5.classExercise;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        // create an array of student objects
        Student[] students = {
                new Student(1, "John", "Doe", "10/10/1996", "MALE", 19),
                new Student(2, "Jane", "Dey", "10/10/1996", "FEMALE", 18),
                new Student(3, "Sani", "Dogo", "10/10/1992", "MALE", 24),
                new Student(4, "Isioma", "Nwobi", "10/10/1998", "FEMALE", 23),
                new Student(5, "Vivian", "Abner", "10/10/1991", "FEMALE", 25),
        };



        // write student objects into a csv file
        String desktopPath = System.getProperty("user.home") + "/Desktop";

        try{
            FileWriter fw = new FileWriter(desktopPath + "/students.csv");
            fw.write("AdmissionId, FirstName, LastName, DOB, Gender, Age\n");
            for(Student student : students){
                fw.write(student.getAdmissionId() + ",");
                fw.write(student.getFirstName() + ",");
                fw.write(student.getLastName() + ",");
                fw.write(student.getDob() + ",");
                fw.write(student.getGender() + ",");
                fw.write(student.getAge() + "\n");
            }
            fw.close();
            System.out.println("Student data has been written into the CSV file successfully");

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
