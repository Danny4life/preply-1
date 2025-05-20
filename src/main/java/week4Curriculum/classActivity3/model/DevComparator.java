package week4Curriculum.classActivity3.model;

import java.util.Comparator;

public class DevComparator implements Comparator<Devs> {
    @Override
    public int compare(Devs d1, Devs d2) {
        if(d1.isFemale() && !d2.isFemale()){
            return -1; // d1 is a female, prioritize over d2
        } else if (!d1.isFemale() && d2.isFemale()) {
            return 1; // d2 is a female, prioritize over d1
        } else if (d1.isMale() && !d2.isMale()) {
            return -1; // d1 is a male, prioritize over d2
        } else if (!d1.isMale() && d2.isMale()) {
            return 1; // d2 is a male, prioritize over d1
        }else{
            return 0; // equal priority
        }
    }
}
