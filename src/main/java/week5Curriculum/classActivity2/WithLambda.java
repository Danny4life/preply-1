package week5Curriculum.classActivity2;

public class WithLambda {
    public static void main(String[] args) {

        SayName s1 = (name) -> "Hello, " + name;
        System.out.println(s1.sayName("JOHN"));

    }
}
