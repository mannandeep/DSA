package DP;

public class equalSumPartition {
	public static int part(int[] arr,int sum , int n) {
		if(sum%2 != 0) {
			return 0;
		}
		
		return partionRec(arr, sum/2 ,n );
		
	}
	
	public static int partionRec(int[] arr, int sum , int n) {
		
		if(sum==0) {
			return 1;
			
		}
		if(n ==0) {
			return 0;
		}
		
		if(arr[n-1]>sum) {
			return partionRec(arr,sum,n-1);
		}
		return partionRec(arr,sum-arr[n-1],n-1) | partionRec(arr,sum,n-1); 
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int set[] = {3, 1, 5, 9, 12 }; 
        int sum = 0;
        int n = set.length;
        for(int i =0;i<n;i++) {
        	sum += set[i];
        }
        
        int ans = part(set,sum,n);
        System.out.println(ans);

	}

}
