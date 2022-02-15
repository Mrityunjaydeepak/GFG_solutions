/** Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle in a fixed direction.

The task is to choose the safe place in the circle so that when you perform these operations starting from 1st place in the circle, you are the last one remaining and survive.
 * 
 */
package recurssion;


import java.util.Scanner;

/**
 * @author mrityunjay
 *
 */
public class josephusProblem {
	static int josephus(int n, int k) {
		if (n == 1)
            return 1;
        else {
            
            return (josephus(n - 1, k) + k - 1) % n + 1;
    }}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(); int k=sc.nextInt();
		System.out.println(josephus(n, k));
		
		sc.close();

	}

}
