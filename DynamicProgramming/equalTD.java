package DP;

public class equalTD {
	
	public static int partition(int[] arr, int sum,int n) {
		if(sum%2!=0) {
			return 0;
		}
	
		return partBU(arr,sum/2,n);
		
	}
	
	public static int partBU(int[] arr, int sum , int n ) {
		int[][] t = new int[n+1][sum+1];
		for(int i =0;i<n;i++) {
			t[i][0] = 0;
		}
		for(int i =1;i<=n;i++) {
			for(int j =1;j<=sum;j++) {
				if(arr[n-1]>j) {
					t[i][j] = t[i-1][j];
				}
				else {
					t[i][j] = t[i-1][j] | t[i-1][j-arr[i-1]];
				}
			}
		}
		return t[n][sum];
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int set[] = {3, 1,1,3}; 
        int sum = 0;
        int n = set.length;
        for(int i =0;i<n;i++) {
        	sum += set[i];
        }
        
        int ans = partition(set,sum,n);
        System.out.println(ans);

	}

	}


