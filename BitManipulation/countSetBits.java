package bit_manipulation;

import java.util.Scanner;

public class countSetBits {
	
	public static int find_pow(int n) {
		int x =0;
		while((1<<x)<n) {
			x++;
		}
		return x-1;
	}
	
	public static int sol(int n) {
		if(n==0) {
			return 0;
		}
		int x = find_pow(n);
		int ans = (int) ((Math.pow(2,x-1) *x ) + (n-Math.pow(2, x) +1) + sol((int) (n-Math.pow(2, x))));
		return ans;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ans = sol(n);
		System.out.println(ans);
	}

}
