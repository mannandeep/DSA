package DP;

public class matixChainMultiplication {
	
	public static int MCM(int[] arr, int i ,int j) {
		if(i>=j) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for(int k = i;k<j;k++) {
			int temp = MCM(arr, i , k) + MCM(arr,k+1, j) + arr[i-1]*arr[k]*arr[j];
			if(temp <ans) {
				ans = temp;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] { 1, 2, 3, 4, 3 };
        int n = arr.length;
 
        System.out.println(
            "Minimum number of multiplications is "
            + MCM(arr, 1, n - 1));

	}

}
