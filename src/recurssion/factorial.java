package recurssion;
import java.util.*;

public class factorial {
	static int fact(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else {
			return n*fact(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int f=sc.nextInt();
		int k=fact(f);
		System.out.println(k);
		sc.close();
		

	}

}
