package bit_manipulation;

public class copySetBitsInRange {
	
	public static int setBits(int x, int y, int l, int r) {
		int mask = (1<<(r-l+1));
		mask--;
		mask =mask<<(l-1);
		
		mask = (mask & y);
		x = (x|mask);
		return x;
	}
	

	public static void main(String[] args) {
		int x = 10;
		int y= 13;
		int l =2;
		int r =3;
		int ans = setBits(x, y, l, r);
		System.out.println(ans);
	}

}
