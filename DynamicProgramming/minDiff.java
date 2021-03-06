package DP;

import java.util.ArrayList;

public class minDiff {
	
	
	    public static int solve(ArrayList<Integer> A) {
	        int start = Integer.MAX_VALUE;
	        int end = 0;
	        
	        for(int a: A){
	            if(a<start){
	                start = a;
	            }
	            end+=a;
	        }
	        ArrayList<Integer> list = new ArrayList<>();
	        for(int i = start;i<=end;i++){
	            if(subsetsum(A, i)){
	                list.add(i);
	            }
	        }
	        
	        int min = Integer.MAX_VALUE;
	        for(int a: list){
	            int diff = Math.abs(end - (2*a));
	            if(diff<min){
	                min = diff;
	            }
	        }
	        return min;
	    }
	    
	    public static boolean subsetsum(ArrayList<Integer> A, int sum){
	        int n = A.size();
	        int[][] dp = new int[n+1][sum+1];
	        
	        for(int i =0;i<sum+1;i++){
	            dp[0][i] = 0;
	        }
	        for(int i =0;i<n+1;i++){
	            dp[i][0] = 1;
	        }
	        
	        for(int i =1;i<n+1;i++){
	            for(int j =1;j<sum+1;j++){
	                if(A.get(i-1)>j){
	                    dp[i][j] = dp[i-1][j];
	                }
	                else{
	                    dp[i][j] = dp[i-1][j] | dp[i-1][j-A.get(i-1)];
	                }
	            }
	        }
	        if(dp[n][sum] == 0){
	            return false;
	        }
	        
	        return true;
	    }
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(6);
		arr.add(11);
		arr.add(5);
		int ans = solve(arr);
		System.out.println(ans);
		
		

	}

}
