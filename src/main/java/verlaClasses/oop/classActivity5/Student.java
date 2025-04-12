package verlaClasses.oop.classActivity5;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import verlaClasses.oop.Gender;

public class Student {

    Gender gender; // implementing aggregation


    @OneToMany
    Teacher teacher;

    // S.O.L.I.D Principles
    // S -- Single Responsibility Principle
    // O -- Open/ Closed Principle
    // L -- Liskov Segregation Principle
    // I -- Interface Separation Principle
    // D -- Dependency Injection Principle
}
