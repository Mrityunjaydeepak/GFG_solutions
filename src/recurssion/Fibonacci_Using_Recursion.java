/**
 * 
 */
package recurssion;

import java.util.Scanner;

/**
 * @author mrity
 *
 */
public class Fibonacci_Using_Recursion {
	static int fibonacci(int n) {
		if(n==1 || n==2) {
			return 1;
		}
		else {
			return fibonacci(n-1)+fibonacci(n-2);
		}
		
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(fibonacci(num));
		
		sc.close();
		

	}

}
