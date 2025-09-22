package marayamFundamentals.casting.upcasting;

import marayamFundamentals.casting.upcasting.Animal;

public class Zoo extends Animal {
    public static void makeSound(Animal animal){
        animal.sound(); // calls overridden version
    }





    public static void main(String[] args) {

        Animal a1 = new Dog(); // Upcasting

        makeSound(a1);
    }
}
