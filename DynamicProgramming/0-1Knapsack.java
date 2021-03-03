package DP;

public class zeroOneBU {
	
	public static int table(int[] weight, int[] val, int w, int n) {
		int[][]t = new int[n+1][w+1];
		for(int i =0;i<n+1;i++) {
			for(int j =0;j<w+1;j++) {
				t[i][0] = 0;
			
			}
		}
		
		for(int i =1;i<n+1;i++) {
			for(int j =0;j<w+1;j++) {
				if(weight[i-1] > w) {
					t[i][j] = t[i-1][j];
				}
				else if(weight[i-1]<=w){
					t[i][j] = Math.max(t[i-1][j] ,val[i-1]+ t[i-1][j-weight[i-1]]);
				}
			}
		}
		return t[n+1][w+1];
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int val[] = new int[] { 60, 100, 120 }; 
        int wt[] = new int[] { 10, 20, 30 }; 
        int W = 10; 
        int n = val.length; 
        System.out.println(table(wt, val,W, n)); 

	}

}
