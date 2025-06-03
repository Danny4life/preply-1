package week4Curriculum.classExercise3A1;

public class Main {
    public static void main(String[] args) {
        GradeTracker gradeTracker = new GradeTracker();

        gradeTracker.addGrade(1, 10.2);
        gradeTracker.addGrade(2, 10.5);
        gradeTracker.addGrade(3, 20.2);

        System.out.println("Grade of student 1 : " + gradeTracker.getGrade(1));

        System.out.println("Grade of student 2 : " + gradeTracker.getGrade(2));

        System.out.println("Grade of student 3 : " + gradeTracker.getGrade(3));

        System.out.println("Grade of student 4 : " + gradeTracker.getGrade(4));


    }
}
