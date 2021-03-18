package bit_manipulation;

public class differentBitsInPairs {
	
	public static int diffBits(int[] arr, int n) {
		int total =0;
		for(int i =0;i<32;i++) {
			int on_count =0;
			
			for(int a : arr) {
				if((a & (1<<i)) !=0) {
					on_count++;
				}
			}
			int off_count = n-on_count;
			total+= on_count *off_count*2;
		}
		return total;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 5 }; 
        int n = arr.length; 
        System.out.println(diffBits(arr, n));
	}

}
