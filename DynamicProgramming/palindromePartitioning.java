package DP;

public class palindromePartitioning {
	
	public static int partition(String s, int i , int j) {
		if(palindrome(s, i ,j)) {
			return 0;
		}
		if(i>=j) {
			return 0;
		}
		int ans = Integer.MAX_VALUE;
		for(int k = i;k<j;k++) {
			int temp = 1+ partition(s, i, k) + partition(s, k+1, j);
			if(temp<ans) {
				ans = temp;
			}
			
		}
		return ans;
	}
	
	public static boolean palindrome(String s , int i , int j) {
		
		while(i<j) {
			if(s.charAt(i) != s.charAt(j)) {
				return false;
			}
			
			j--;
			i++;
			
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ababbbabbabab";
		int ans = partition(s, 0, s.length()-1);
		System.out.println(ans);
		

	}

}
