package selahattin.switchStatement;

public class SwitchStatement {

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
    }
}
