import java.util.Scanner;
//take information and show information;
//constructor khong tham so, lay input;


class People{
    String name; //public String name;
    int age; //public int age;

    public void getInformation(){    
        Scanner sc = new Scanner(System.in); //take input;
        name = sc.nextLine();
        age = sc.nextInt();
    }

    public void display(){
        System.out.println("My name is " + name); //show information function;
        System.out.println("I'm " + age);
    }
}
public class Main{    
    public static void main(String[]args){    //main function
        People myself = new People();
        myself.getInformation();
        myself.display();
    }
}


///////////////////////////////////////
//tinh chu vi dien tich cua hinh chu nhat;
class Rectangle{
	double width;
    double length;

    public void getInformation(){
        Scanner sc = new Scanner(System.in);
        width = sc.nextDouble();
        length = sc.nextDouble();
    }

    public void display(){
        System.out.println("Area: " + (width * length));
        System.out.println("Perimeter: " + 2*(width + length));
    }

}

public class Entry {
	public static void main(String[]args) {
		Rectangle r = new Rectangle();
		r.getInformation();
		r.display();
	}
}