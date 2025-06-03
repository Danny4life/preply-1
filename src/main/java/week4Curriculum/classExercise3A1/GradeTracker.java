package week4Curriculum.classExercise3A1;

import java.util.HashMap;

public class GradeTracker {
    HashMap<Integer, Double> gradeMap;

    public GradeTracker() {
        this.gradeMap = new HashMap<>();
    }

    public void addGrade(int studentId, double grade){
        gradeMap.put(studentId, grade);
    }

    public double getGrade(int studentId){

        return gradeMap.getOrDefault(studentId, -1.0);
    }
}
