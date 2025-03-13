package selahattin.controlFlowStatement;

public class CityNames {

    public static void main(String[] args) {

        String city = "New York";

        if(city == "California"){
            System.out.println("City is California");
        } else if (city == "Texas") {
            System.out.println("City is Texas");

        } else if (city == "Boston") {
            System.out.println("City is Boston");
        }else {
            System.out.println("City is " + city);
        }
    }
}
