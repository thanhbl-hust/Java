class Person{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}


class Student extends Person{
    //Student ke thua cac thuoc tinh nhu name, age cua lop Person;
    private double GPA;
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    public double getGPA(){
        return GPA;
    }
}

public class Main_ex{
    public static void main(String[] args){
        Student s = new Student();
        s.setName("Lam Thanh");
        s.setAge(20);
        s.setGPA(4.0);
        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
        System.out.println("Score: " + s.getGPA());
    }
}