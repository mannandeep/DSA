package bit_manipulation;

public class binaryStringDivisibleBy3 {
	
	public static boolean isDivisible(String str) {
		int even =0;
		int odd =0;
		for(int i =0;i<str.length();i++) {
			if(i %2 ==0) {
				even+=(str.charAt(i)-'0');
			}
			else {
				odd+=(str.charAt(i)-'0');
			}
		}
		
		int ans = Math.abs(odd-even);
		return (ans%11 ==0)? true:false;
	}
	
	

	public static void main(String[] args) {
		String str = "10010011";
		System.out.println(isDivisible(str));
		
	}

}
