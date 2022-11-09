import java.util.Scanner;

//khong lay input tu user;
//khai bao gia tri tham so;

class People{
    String name; //private, public;
    int age;  //private, public;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
        //constructor: use 'this';
    }

    public void display(){
        System.out.println("My name is " + name);
        System.out.println("I'm " + age);
    }

}
public class Main{
    public static void main(String[]args){
        People myself = new People("Lam Thanh", 20);
        myself.display();
    }
}
/////////////////////////////
//function give back Square infor

class Square{
    private double length;
    public Square(double length){
        this.length = length;
    }

    public double dt(){
        return length * length;
    }
    public double cv(){
        return length * 4;
    }
}
public class Main{
    public static void main(String[] args){
        Square mySquare = new Square(5); //create an object Square with this.length = 5;
        System.out.println("Dien tich: " + mySquare.dt());
        System.out.println("Chu vi: " + mySquare.cv());
    }
}