package bit_manipulation;

import java.util.ArrayList;
import java.util.Scanner;

public class findDuplicatesandMissing {
	public static ArrayList<Integer> find(int[] arr){
		int n = arr.length;
		int xor = 0;
		ArrayList<Integer> list = new ArrayList<>();
		for(int i =0;i<n;i++) {
			xor ^=arr[i];
		}
		for(int i=0;i<n;i++) {
			xor^=i;

		}
		int rmsb = xor &(-xor);
		int x =0;
		int y =0;
		for(int i =0;i<n;i++) {
			if((i & rmsb) == rmsb) {
				x ^=i;
			}
			else {
				y ^=i;
			}
		}
		for(int val : arr) {
			if((val & rmsb) == rmsb) {
				x ^=val;
			}
			else {
				y ^=val;
			}
		}
		list.add(x);
		list.add(y);
		return list;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i =0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		ArrayList<Integer> ans = find(arr);
		System.out.println(ans);

	}

}
