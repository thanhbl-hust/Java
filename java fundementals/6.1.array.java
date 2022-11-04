import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
        int[] a = new int[10];
		for(int i = 0; i < 10; i++) {
			a[i] = sc.nextInt(); //take input
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(a[i] + " "); //show array;
		}
	}
}


public class MaxValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] a = new int[n];
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt(); //take input
		}
		int maxValue = a[0];
		for(int i = 1; i < n; i++){
			if(a[i] > maxValue){
				maxValue = a[i];
			}
		}
		System.out.println(maxValue);
	}
}