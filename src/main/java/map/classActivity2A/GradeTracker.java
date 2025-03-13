package map.classActivity2A;

import java.util.HashMap;
import java.util.Map;

public class GradeTracker {

    Map<Integer, Double> studentGrade = new HashMap<>();

    public GradeTracker() {
        this.studentGrade = new HashMap<>();
    }

    void addGrade(int studentId, double grade){
        studentGrade.put(studentId, grade);
    }

    public double getGrade(int studentId){
        return studentGrade.getOrDefault(studentId, -1.0);

    }

    public static void main(String[] args) {
        GradeTracker tracker = new GradeTracker();

        tracker.addGrade(101, 10.0);
        tracker.addGrade(102, 20.0);
        tracker.addGrade(103, 30.0);


        System.out.println("Grade for student 101: " + tracker.getGrade(101));
        System.out.println("Grade for student 102: " + tracker.getGrade(102));
        System.out.println("Grade for student 103: " + tracker.getGrade(103));
        System.out.println("Grade for student 104: " + tracker.getGrade(104));
    }


}
