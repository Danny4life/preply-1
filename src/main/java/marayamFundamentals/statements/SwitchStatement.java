package marayamFundamentals.statements;

public class SwitchStatement {

    public static void main(String[] args) {

        int num = 2;

        switch (num){
            case 0:
                System.out.println(num);
                break;
            case 1:
                System.out.println(num);
                break;
            case 2:
                System.out.println(num);
                break;
            default:
                System.out.println("Not a number");
        }

        /**
         * Using switch statement
         * Step 1 - declare a variable of type int and name it day and assign 3 to the variable
         * Step 2- Using switch statement check for different cases and print out the particular
         * day that correspond to the day num e.g day 1 should print out Monday
         * lastly set your default print to not a day, don't forget your break statement
         */
    }
}
