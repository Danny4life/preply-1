package hamlin_lesson.unit2;

public class SwitchStatementEx {

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
                System.out.println("None is correct");
        }

        if(num == 0){
            System.out.println("Number is 0");
        } else if (num == 1) {
            System.out.println("Number is 1");

        }else {
            System.out.println("None is correct");
        }
    }



}
