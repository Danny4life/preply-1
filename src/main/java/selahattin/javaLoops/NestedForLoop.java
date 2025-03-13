package selahattin.javaLoops;

public class NestedForLoop {

    public static void main(String[] args) {

        // outer for loop
        for(int i = 1; i <= 3; i++){
            // inner for loop
            for(int j = 1; j <= 3; j++){
                System.out.println(i + " " + j);
            }



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
