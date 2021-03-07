
package DP;

public class cuttingRod {
	//recursive Solution
	
	public static int cut(int[] length,int[] price, int n, int s, int[][] t) {
		if(n == 0 ) {
			return 0;
		}
		if(t[n][s] != -1) {
			return t[n][s];
		}
		
		if(length[s-1] > n) {
			return t[n][s] =  cut(length,price,n,s-1,t);
		}
		
		return t[n][s] =  Math.max(cut(length,price,n,s-1,t), price[s-1]+cut(length,price,n-length[s-1],s,t));
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int price [] = { 1, 5, 8, 9, 10, 17, 17, 20 };

		int s = length.length;
		
		int n = 4;
		int[][] t = new int[n+1][s+1];
		for(int i =0;i<n;i++) {
			for(int j =0;j<s;j++) {
				t[i][j] = -1;
			}
		}
		int max = cut(length,price,n,s, t);
		System.out.println(max);

	}

}
