/**
 * Print numbers from 1 to N without the help of loops
 */
package recurssion;

import java.util.Scanner;

/**
 * @author mrityunjay
 *
 */
public class onetoNwithoutloops {
	static void printNum(int n) {
		if(n>0) {
			printNum(n-1);
			System.out.print(n+" ");
		}
		return;}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int num;
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		printNum(num);
		sc.close();

	}

}
