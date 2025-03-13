package generics.classActivity9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericRepository<K, V>{

    // The Map is an interface, while the HashMap is the class that help you implement the Map interface

    private Map<K, V> storage = new HashMap<>();


    // SAVE AN ENTITY
    public void save(K key, V value){
        storage.put(key, value);
    }

    // Retrieve an entity by key
    public V findById(K key){
        return storage.get(key);
    }

    // Delete an entity by key
    public void delete(K key){
        storage.remove(key);

    }

    // Print all stored values
    public void printAll(){
        storage.forEach((k, v) ->System.out.println(k + " -> " + v));
    }
}
