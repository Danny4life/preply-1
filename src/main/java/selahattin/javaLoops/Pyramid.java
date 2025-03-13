package selahattin.javaLoops;

public class Pyramid {

    public static void main(String[] args) {

        for(int i = 1; i <= 3; i++){ // Outer for loop (rows)
            for(int j = 1; j <= 3; j++){ // Inner for lop (columns)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/**
 * How it works
 * Step 1. The outer for loop (i) starts and runs from 1 to 3
 * Step 2. The inner for loop (j) runs completely for each value of i
 * Step 3. the print out (*) prints a star on the same line
 * Step 4. After the inner loop finishes, the println moves to the next line
 */
