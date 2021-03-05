package DP;

public class SubsetSum {
	//Recursive and memo solution
	
	
	public static int findSubSet(int[] arr, int sum ,int n ) {
		int[][] t = new int[100][100];
		for(int i =0;i<100;i++) {
			for(int j =0;j<100;j++) {
				t[i][j]=-1;
			}
		}
		
		if(sum==0) {
			return 1;
		}
		if(n==0) {
			return 0;
		}
		if((t[sum][n])!=-1) {
			return t[sum][n];
		}
		
		
		if(arr[n-1]>sum) {
			
			return t[sum][n] =  findSubSet(arr,sum,n-1);
			
		}
		
		return t[sum][n] = findSubSet(arr,sum-arr[n-1],n-1) + findSubSet(arr,sum,n-1);
		
		
	
	}
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int set[] = { 3,3,3,3 }; 
        int sum = 6; 
        int n = set.length;
        int ans = findSubSet(set,sum,n);
        System.out.println(ans);
		

	}

}
