package bit_manipulation;

import java.util.Scanner;

public class triplets {
	
	public static int find_count(int[] arr) {
		int count =0;
		for(int i=0;i<arr.length;i++) {
			int xor= arr[i];
			for(int k=i+1;k<arr.length;k++) {
				xor ^=arr[k];
				if(xor == 0) {
					count+=(k-i);
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		int ans = find_count(arr);
		System.out.println(ans);
		

	}

}
