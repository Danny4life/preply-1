package verlaClasses;

public class SwitchStatementEx1 {

    /**
     *
     * @param args
     * Using a switch statement check if a particular is day 3
     * Step 1: initialized a variable day and assigned it to 3, it should be of type int
     * Step 2: create your switch statement and add the day as parameter
     * Step 3: call case 1 and if it is true print out MONDAY, break out
     * Step 4 and beyond do the same for the rest days of the week
     * NOTE:  your default should print out not a day if none of the days matched the given number
     */

    public static void main(String[] args) {

        int num = 2;

        switch (num){
            case 0:
                System.out.println("Number is 0");
                break;
            case 1:
                System.out.println("Number is 1");
                break;
            default:
                System.out.println(num);

        }

        if(num == 0){
            System.out.println("Number is 0");
        } else if (num == 1) {
            System.out.println("Number is 1");

        }else {
            System.out.println(num);
        }
    }
}
