package marayamFundamentals.loopd;

public class LoopTask {

    public static void main(String[] args) {

        for (int i = 1; i <= 6; i++) { // Outer for loop

            for(int j = 1; j <= i; j++){ // Inner for loop

                System.out.print("* ");
            }

            System.out.println();

        }

    }

}

