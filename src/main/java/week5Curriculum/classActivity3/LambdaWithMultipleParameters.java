package week5Curriculum.classActivity3;

public class LambdaWithMultipleParameters {
    public static void main(String[] args) {
        Addable a1 = (n1, n2) -> n1 + n2;
        System.out.println(a1.add(5,5));
    }
}
