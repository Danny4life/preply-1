package generics.classActivity4;

public class GenericMethod {

    // Generic inside a method
    public static <T> void printArray(T[] array){
        for(T element : array){
            System.out.print(element + " ");
        }

        System.out.println();

    }

    public static void main(String[] args) {
        Integer[] intArray = {10, 20, 30, 40, 50};
        String[] strArray = {"One", "Two", "Three", "Four"};

        printArray(intArray);
        printArray(strArray);
    }
}
