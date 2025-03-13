package generics.classActivity5;

public class BoundedTypeGenerics <T extends Number>{
    private T number;

    public void setNumber(T number){
        this.number = number;
    }

    public double getDoubleValue(){
        return number.doubleValue();
    }

    public static void main(String[] args) {

        BoundedTypeGenerics<Integer> intGeneric = new BoundedTypeGenerics<>();
//        BoundedTypeGenerics<Double> doubleGeneric = new BoundedTypeGenerics<>();
//        BoundedTypeGenerics<Float> floatGeneric = new BoundedTypeGenerics<>();


       // BoundedTypeGenerics<String> strGeneric = new BoundedTypeGenerics<>();
       // intGeneric.setNumber(10);

        System.out.println(intGeneric.getDoubleValue());
    }
}
