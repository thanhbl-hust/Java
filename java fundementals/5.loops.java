//java loops;

import java.util.Scanner;

public class Loop {

    public static int count(int n){
        int value = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 == 1){
                value += i;
            }
        }
        return value;
    }
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        //tinh tong so le tu 0 den n;
        int value = count(n);
        System.out.println(value);
    }
}


public class While {
    
    public static void main(String[] args) {
        //while: easy;
	}
}