//Variables, declared variables and data types;


public class Variable1 {
	public static void main(String[] args) {
		int a, b;
        String name = "Lam Thanh";
        a = 254;
        b = 343;
        
        float fl = 10.5f; //must have f after number, double no need;

        char ch = 'a';


        System.out.println("My name is " + name);
		System.out.println("a + b = " + (a + b));
        System.out.println("Char = " + ch);
	}
}

public class Variable2 {
	public static void main(String[] args) {
        char d = 'a' + 3;     
		char e = 'd' + 1;
		System.out.println(d);  //->>>> d;
		System.out.println(e);  //->>>> e;


        //long type;
        long a = 384847522;
		long b = 988347273;
		System.out.println(a * b);

        boolean check = 5 > 4;
        System.out.println(check); //true;
	}
}
