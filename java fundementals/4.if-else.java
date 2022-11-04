import java.util.Scanner;

public class Statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 == 0) {
			System.out.println("n is an even number!");
		} else {
			System.out.println("n is an odd number!");
		}


        //so sanh 2 string trong java
        //a.equals(b);
        String a = sc.next();
        String b = sc.next();
        if(a.equals(b)){
            System.out.println("A equals B.");
        }else{
            System.out.println("Different!");
        }
	}
}


