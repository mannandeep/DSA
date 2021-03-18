package bit_manipulation;

public class swapAllEvenOddBIts {
	
	public static int swap(int n) {
		int mask_even = 0xAAAAAAAA;
		int mask_odd = 0X55555555;
		int even = ((n&mask_even)>>1);
		int odd = ((n&mask_odd)<<1);
		return (even | odd);
	}

	public static void main(String[] args) {
		int n = 23; 
		System.out.println(swap(n));
	}

}
