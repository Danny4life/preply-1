package najah.classActivity1;

public class Car {

    String color;  // State or Characteristics

    int speed;// State or Characteristics


    public Car(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public String getColor() {
        return color;
    }

    public int getSpeed() {
        return speed;
    }

    void drive(){
        System.out.println("Car is driving"); // behaviour
    }

    void brake(){
        System.out.println("Car has brakes");  // behaviour
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }
}
