package generics.classActivity3;

public class Box<T>{
    // this is a custom generics

    private T value;

    public T getValue(){
        return value;
    }

    public void setValue(T value){
        this.value = value;
    }

    public static void main(String[] args) {
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generics");
        System.out.println(stringBox.getValue());

        Box<Integer> integerBox = new Box<>();
        integerBox.setValue(100);
        System.out.println(integerBox.getValue());



    }

}
