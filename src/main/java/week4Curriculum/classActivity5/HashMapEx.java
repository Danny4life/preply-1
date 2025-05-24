package week4Curriculum.classActivity5;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap<Integer, String> fruits = new HashMap<>();

        fruits.put(1, "Mango");
        fruits.put(2, "Apples");
        fruits.put(3, "Cherry");
        fruits.put(4, "Banana");
        fruits.put(5, "Carrot");
        fruits.put(5, "Berries");
        fruits.put(6, "Mango");

        //use the remove method to delete a key
       // fruits.remove(2);

        // use the replace method to replace apples
        //fruits.replace(2, "PawPaw");

        // show use of contains key method
        //System.out.println(fruits.containsKey(1));

        // show use of get method
        //System.out.println(fruits.get(1));

        // the Entry is the sub-interface of the Map and provide methods to return all the keys and values

        for(Map.Entry f : fruits.entrySet()){
            System.out.println(f.getKey() + " " + f.getValue());
        }
    }
}
