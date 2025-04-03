package verlaClasses;

public class NestedForLoop {

    public static void main(String[] args) {

        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }

            System.out.println();
        }
        /**
         * in the first row i= 1, so the inner loop prints 1 *
         * in the second row, i = 2, so it prints 2 starts
         * this continues until i = 5, where it now prints 5 star
         */
    }
}
