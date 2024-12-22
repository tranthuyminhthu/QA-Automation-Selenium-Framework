package Java_Core.lession04_overriding_overloading;

public class OverLoading_Exercise {

    public int sum (int a, int b){
        return a+b;
    }

    public double sum(double b, double a, double c){
       return  b + a + c;
    }

    public float sum (float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        OverLoading_Exercise bt = new OverLoading_Exercise();
        System.out.println(bt.sum(1,2));
        System.out.println(bt.sum(2f,4f));
        System.out.println(bt.sum(4, 9, 8));
    }
}
