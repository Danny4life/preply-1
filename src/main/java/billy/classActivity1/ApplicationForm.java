package billy.classActivity1;

public class ApplicationForm { // Class

    private String name; // this are fields data which represent the state of an object

    private String gender;

    private int age;

    public ApplicationForm(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    // this is the behaviour of the object
    void submitForm(){
        System.out.println("Form submitted successfully!");
    }

    public static void main(String[] args) {
        ApplicationForm formObj = new ApplicationForm("John", "MALE", 25);

        formObj.submitForm();// object
    }


}
