package billy.hibernate_project;

import billy.hibernate_project.dao.StudentDAO;
import billy.hibernate_project.entity.Student;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Insert a new student into DB
       // StudentDAO.addStudent("John Doe", "john@gmail.com");

        // Fetch student
//        List<Student> students = StudentDAO.getStudents();
//        for(Student s : students){
//            System.out.println(s.getId() + " - " + s.getName() + " - " + s.getEmail());
//        }

        // update student
       // StudentDAO.updateStudent(1L, "Alice Jame", "alice@gmail.com");

        // Delete a student
        StudentDAO.deleteStudent(1L);


    }
}
