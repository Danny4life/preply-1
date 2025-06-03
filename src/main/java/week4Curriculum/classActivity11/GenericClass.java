package week4Curriculum.classActivity11;

public class GenericClass<T> {
    //The T type indicates that it can refer to any type (like String, Integer, and Employee).
    //The type you specify for the class will be used to store and retrieve the data.
    T obj;

    void add(T obj){
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }
}
