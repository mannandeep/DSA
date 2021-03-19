package bit_manipulation;

import java.util.Scanner;

public class reduceToOne {
	
	public static int find_num(long n) {
		int count =0;
		while(n!=1) {
			if(n%2 ==0) {
				n= n/2;
			}
			else if(n==3) {
				count = 2;
				return count;
			}
			else if((n & 3) == 1) {
				n= n-1;
			}
			else if((n&3) == 3) {
				n = n+1;
			}
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = find_num(n);
		System.out.println(ans);
		

	}

}
