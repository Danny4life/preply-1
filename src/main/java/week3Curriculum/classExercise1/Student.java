package week3Curriculum.classExercise1;

public class Student {
    private int admissionNumber;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String gender;
    private int age;

    // Constructor
    public Student(int admissionNumber, String firstName, String lastName, String dateOfBirth, String gender, int age) {
        this.admissionNumber = admissionNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.age = age;
    }

    // Getters
    public int getAdmissionNumber() {
        return admissionNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    // toString method
    @Override
    public String toString() {
        return admissionNumber + "," + firstName + "," + lastName + "," + dateOfBirth + "," + gender + "," + age;
    }
}
