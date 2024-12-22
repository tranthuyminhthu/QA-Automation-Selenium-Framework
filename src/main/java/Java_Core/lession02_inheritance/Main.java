package Java_Core.lession02_inheritance;

import Java_Core.lession03_accessmodifer.AccessModifier;

public class Main {
    public static void main(String[] args) {
        IRun irun = new Cat();
        Animal animal = new Cat();
        Cat cat = new Cat();
        irun.run();
        animal.makeSound();
        cat.meo();
        cat.run();
        cat.makeSound();
        AccessModifier a = new AccessModifier();
    }
}
