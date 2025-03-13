package generics.classActivity8;

public class Pair <K, V>{

    private K key;
    private V value;

    public Pair(K key, V value){
        this.key = key;
        this.value = value;
    }

    public K getKey(){
        return key;
    }

    public V getValue(){
        return value;
    }
}

class KeyValueExample{
    public static void main(String[] args) {

        Pair<String, Integer> employeeInfo = new Pair<>("John", 30);

        System.out.println(employeeInfo.getKey() + " is " + employeeInfo.getValue());
    }
}
