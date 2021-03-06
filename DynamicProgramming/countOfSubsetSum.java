package DP;

public class countOfSubsetSum {
	
	public static int count(int[] arr, int n, int k) {
		int[][] dp = new int[n+1][k+1];
		
		for(int i =0;i<k+1;i++) {
			dp[0][i] = 0;
		}
		for(int i =0;i<n+1;i++){
			dp[i][0]= 1;
		}
		for(int i =1;i<n+1;i++) {
			for(int j =1;j<k+1;j++) {
				if(arr[i-1] > j) {
					dp[i][j] = dp[i-1][j];
				}
				else {
					dp[i][j] = (dp[i-1][j]+ dp[i-1][j-arr[i-1]]);
				}
			}
		}
		return dp[n][k];
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 3};
		int n = arr.length;
		int k = 6;
		int ans = count(arr, n, k);
		System.out.println(ans);

	}

}
