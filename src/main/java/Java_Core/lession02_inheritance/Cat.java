package Java_Core.lession02_inheritance;

public class Cat extends Animal implements IRun{

    @Override
    public void makeSound (){
        System.out.println("mwomweo");

    }

    public void meo (){
        System.out.println("meo");

    }

    @Override
    public void run() {
        System.out.println("run");
    }
}
