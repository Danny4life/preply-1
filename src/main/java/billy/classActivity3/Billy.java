package billy.classActivity3;

public class Billy {
    int id;

    String name;

    Address address;

    public Billy(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println("Employee ID and Name: " + id + " " + name);
        System.out.println("Employee Address: " + address.city + ", " + address.state + ", " + address.country + ".");
    }

    public static void main(String[] args) {

        Address address1 = new Address("Ikeja", "Lagos", "Nigeria");

        Billy employee = new Billy(1, "Billy", address1);

        employee.display();
    }


}
