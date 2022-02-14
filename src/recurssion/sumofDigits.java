/**
 * 
 */
package recurssion;

import java.util.Scanner;

/**
 * @author mrityunjay
 *
 */
public class sumofDigits {
	static int sOd(int n) {
		 if (n == 0)
			    return 0;
			    return (n % 10 + sOd(n / 10));
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		System.out.println(sOd(num));
		sc.close();

	}

}
