package week4Curriculum.classActivity10;

public class GenericsMethod {
    public static <E> void printArr(E[] elements){
        for(E e : elements){
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        Integer[] intArr = {10,20,30,40,50};
        Character[] chaArr = {'J', 'A', 'V', 'A'};

        System.out.println("Print integer array :");
        printArr(intArr);

        System.out.println("printing character array :");
        printArr(chaArr);
    }
}
