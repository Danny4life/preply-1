package map.lockerRoom;

import java.util.HashMap;

public class LockerRoom {
    public static void main(String[] args) {
        HashMap<String, String> compartment = new HashMap<>();

        compartment.put("A1", "Shoe");
        compartment.put("B2", "Bag");
        compartment.put("C3", "Shirt");

        // Retrieve an item from the compartment
        System.out.println("Item in compartment A1: " + compartment.get("A1"));

        System.out.println("Does compartment B2 exists? " + compartment.containsKey("B2"));

        compartment.put("A1", "Sport wear");

        System.out.println("Item in compartment A1: " + compartment.get("A1"));

        // Remove item from compartment
        compartment.remove("C3");
        System.out.println("Does compartment C3 exists? " + compartment.containsKey("C3"));


        /**
         * A1 is first converted into a hashcode = 123
         * 123 % 16
         */


    }
}
