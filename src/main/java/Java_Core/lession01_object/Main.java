package Java_Core.lession01_object;

public class Main {

    // Class là khuôn mẫu
    // Object la doi tuong the hien class do

    // Tao doi tuong voi class

    public static void main(String[] args) {
        Student st = new Student("thu",18, "IT");
        Student st2 = new Student("meo", 2);
        System.out.println("tr oi" + st.displayInfor());
        System.out.println("j z tr" + st2.displayInfor());
    }
}
