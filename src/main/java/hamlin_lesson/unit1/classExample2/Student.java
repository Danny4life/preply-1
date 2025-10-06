package hamlin_lesson.unit1.classExample2;

public class Student {
    String name;
    int age;

    void greet() {
        System.out.println("Hi, I am " + name + " and I’m " + age + " years old!");
    }

    public class ObjectDemo {
        public static void main(String[] args) {
            Student s1 = new Student();   // create object
            s1.name = "Ada";
            s1.age = 17;
            s1.greet();   // call method
        }

    }
}
