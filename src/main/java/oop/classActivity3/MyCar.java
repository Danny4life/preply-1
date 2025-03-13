package oop.classActivity3;

public class MyCar {

    String brand;

    int speed;

    public MyCar(){

    }

    public MyCar(String brand){
        this.brand = brand;

    }

    public MyCar(String brand, int speed){
        this.brand = brand;
        this.speed = speed;
    }

    void display(){
        System.out.println("Brand: " + brand + " " + "Speed: " + speed);
    }

    public static void main(String[] args) {

        MyCar car1 = new MyCar();
        MyCar car2 = new MyCar("Toyota", 30000);
        MyCar car3 = new MyCar("Honda");

        car1.display();
        car2.display();
        car3.display();
    }
}
