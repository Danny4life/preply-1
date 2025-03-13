package oop.classActivity3;

public class MathOperations {

    public static int add(int a, int b){
        return a + b;
    }

    public static int add(int a, int b, int c){
        return a + b + c;
    }

    public static int add(int a, int b, int c, int d){
        return a + b + c + d;
    }

    public static void main(String[] args) {
        System.out.println(MathOperations.add(2,3));
        System.out.println(MathOperations.add(2,2,2));
        System.out.println(MathOperations.add(3,4,5,6));
    }
}
