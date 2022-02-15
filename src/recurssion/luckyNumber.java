package recurssion;

import java.util.Scanner;

public class luckyNumber {
	static boolean isLucky( int n ) {
		int count=2;
		if(count > n)
            return true;
        if(n%count == 0)
            return false;     
  
       
        int nextPosition = n - (n/count);
    
        count++;
        return isLucky(nextPosition);
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		if(isLucky(num)) {
			System.out.println(1);
		}
		else {

			System.out.println(0);
		}
		
		sc.close();

	}

}
