package bit_manipulation;

public class numOfFlips {
	
	public static int FlippedCount(int a, int b) {
		int x = (a^b);
		int count =0;
		while(x!=0) {
			int rmsb = (x&(-x));
			x = x- rmsb;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int a = 10; 
        int b = 20; 
        System.out.print(FlippedCount(a, b)); 
	}

}
