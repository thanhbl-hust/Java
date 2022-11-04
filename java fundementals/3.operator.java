//Operator - Toan tu trong java;


import java.util.Scanner;
//take input from user;


public class Input {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Hello " + name);


		//Char at;
		String name = "abcdefgh";
		System.out.println(name.charAt(5));
	}
}