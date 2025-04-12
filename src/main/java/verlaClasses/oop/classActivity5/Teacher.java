package verlaClasses.oop.classActivity5;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import verlaClasses.oop.Gender;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    Gender gender;

    @ManyToOne
    List<Student> student = new ArrayList<>();
}
