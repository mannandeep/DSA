package bit_manipulation;

public class multiply_divide {
	public static int result(int n) {
		return (((n<<3)-n)>>3);
		
	}

	public static void main(String[] args) {
		int n = 3;
		System.out.println(result(n));
		
	}

}
