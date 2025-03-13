package classActivity1;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetEx {
    public static void main(String[] args) {

//        Set<String> hashSetNames = new HashSet<>();
//
//        hashSetNames.add("John");
//        hashSetNames.add("Grace");
//        hashSetNames.add("Gary");
//        hashSetNames.add("Patrick");

//        System.out.println(hashSetNames.size());
//
//        System.out.println(hashSetNames.remove("Patrick"));
//
//        hashSetNames.clear();

//        for(String names : hashSetNames){
//            System.out.println(names);
//        }

      //  hashSetNames.forEach(System.out::println);

      //  System.out.println("Hash set: " + hashSetNames);


        Set<String> treeSetNames = new TreeSet<>();
        treeSetNames.add("John");
        treeSetNames.add("Grace");
        treeSetNames.add("Gary");
        treeSetNames.add("Patrick");
        treeSetNames.add("Patrick");

       // System.out.println("Tree set: " + treeSetNames);

        Set<String> linkedHashSetNames = new LinkedHashSet<>();
        linkedHashSetNames.add("John");
        linkedHashSetNames.add("Grace");
        linkedHashSetNames.add("Gary");
        linkedHashSetNames.add("Patrick");
        linkedHashSetNames.add("Patrick");

        System.out.println("Linked hash set set: " + linkedHashSetNames);
    }
}
