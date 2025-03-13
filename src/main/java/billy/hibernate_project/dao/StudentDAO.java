package billy.hibernate_project.dao;

import billy.hibernate_project.entity.Student;
import billy.hibernate_project.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class StudentDAO {

    public static void addStudent(String name, String email){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Student student = new Student(name, email);
        session.save(student);

        transaction.commit();
        session.close();

    }

    public static List<Student> getStudents(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Student> students = session.createQuery("FROM Student", Student.class).list();
        session.close();

        return students;
    }

    public static void updateStudent(Long id, String newName, String newEmail){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Student student = session.get(Student.class, id);
        if(student != null){
            student.setName(newName);
            student.setEmail(newEmail);
            session.update(student);
        }

        transaction.commit();
        session.close();
    }

    public static void deleteStudent(Long id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Student student = session.get(Student.class, id);

        if(student != null){
            session.delete(student);
        }

        transaction.commit();
        session.close();

    }
}
