package Java_Core.lession01_object;

public class Student {

    private String name;
    private int age;
    private String major;

    public Student (String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public Student (String name, int age){
        this.name = name;
        this.age = age;
        this.major = "";
    }

    public String displayInfor (){
        return this.name;
    }

}
