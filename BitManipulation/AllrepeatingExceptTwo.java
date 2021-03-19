package bit_manipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class AllrepeatingExceptTwo {
	
	public static ArrayList<Integer> sol(int[] arr) {
		int xxory = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int val : arr) {
			xxory = xxory ^ val;
		}
		int rmsb = xxory & (-xxory);
		int x =0;
		int y =0;
		for(int val : arr) {
			if((val & rmsb) == rmsb) {
				x = x^val;
			}else {
				y = y^val;
			}
		}
		list.add(x);
		list.add(y);
		return list;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> ans = sol(arr);
		System.out.println(ans);
		
	}

}
