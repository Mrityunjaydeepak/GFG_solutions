/**
 * You are given a number n. You need to find the digital root of n. DigitalRoot of a number is the recursive sum of its digits until we get a single digit number.
 */
package recurssion;

import java.util.Scanner;

/**
 * @author mrityunjay
 *
 */
public class digitalRoot {
	static int digitalRoot(int n) {
		 if (n <= 9) {
			    return n;}
		 return digitalRoot((n % 10 ) + (n / 10));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(digitalRoot(num));
		sc.close();

	}

}
