package recursion;
//Sum of array elements using recursion
public class Sum {
	public int sum(int[] arr, int N) {
		if(N<=0 ) {
			return 0;
		} else {
			return (arr[N-1] + sum(arr,N-1));
		}
	}
	
	
	public static void main(String[] args) {
		int[] arr = {2,4,5};
		int N = arr.length;
		Sum solution = new Sum();
		System.out.println(solution.sum(arr,N));

	}

}
