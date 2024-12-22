package Java_Core.lession04_overriding_overloading;

public class Cat extends Person{
@Override
    public void living(){
    // tu khoa supper de goi cha
    super.living();
    System.out.println("HCM");
    }

    public static void main(String[] args) {
    // goi chinh no
        Cat meo = new Cat();
        meo.living();

        // goi thong qua cha se goi dc nhung phuong thuc k overide
        Person per = new Cat();
        per.living();

        // phuong thuc cua cha
        per.sound();

    }
}
