
package bit_manipulation;

public class rightMostSetBit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 9;
		int count = 0;
		while(x>0) {
			int rmsb = x & -x;
			x-=rmsb;
			count++;
		}
		System.out.println(count);

	}

}
