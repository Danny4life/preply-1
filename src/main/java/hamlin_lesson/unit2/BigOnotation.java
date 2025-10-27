package hamlin_lesson.unit2;

public class BigOnotation {

    public static void main(String[] args) {

        //0(1)
        int[] arr = {5,5,5,5,5};

        int res = arr[0];

        // O(n)
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

// O(n²)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.println(i + "," + j);
            }
        }
    }
}
