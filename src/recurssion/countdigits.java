package recurssion;

import java.util.Scanner;

public class countdigits {
	static int countDigits(int n) {
		int count=0;
		if(n<10) {
			return 1;
		}
		else {
			return 1+countDigits(n/10);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println(countDigits(n));
		sc.close();
	}

}
