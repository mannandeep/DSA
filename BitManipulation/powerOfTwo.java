package bit_manipulation;

import java.util.Scanner;

public class powerOfTwo {
	
	public static boolean powerofTwo(int x) {
		int n = (x-1);
		return ((x&n)==0) ? true :  false;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		System.out.println(powerofTwo(x));
		
	}

}
