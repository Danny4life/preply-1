package sriza.solidPrinciples.classActivity9;



public class Main {
    public static void main(String[] args) {


       UserService user1 = new UserService();
       UserService user2 = new UserService();

        System.out.println("user1");
        user1.getUser();

        System.out.println("user2");
        user2.getUser();
    }
}
