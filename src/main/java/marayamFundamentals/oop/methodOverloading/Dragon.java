package marayamFundamentals.oop.methodOverloading;

import marayamFundamentals.oop.Animal;
import marayamFundamentals.oop.methodOverloading.methodOveriding.ZooOne;

public class Dragon  implements Zoo, ZooOne {
    @Override
    public void eat() {
        System.out.println("Dragon is eating");
    }

    @Override
    public String run() {
        return "Dragon is flying";
    }

    @Override
    public int num(int a, int b) {
        return a + b;
    }

    @Override
    public void myMethod() {

    }
}
