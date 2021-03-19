package bit_manipulation;

public class JosephusProblemAlgorithm {
	
	public static int sol(int x) {
		int first = power(x);
		int l= x-first;
		return (2*l+1);
		
	}
	public static int power(int x) {
		int i=1;
		while(i*2<=x) {
			i = i*2;
		}
		return i;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =5;
		int ans = sol(x);
		System.out.println(ans);
		

	}

}
