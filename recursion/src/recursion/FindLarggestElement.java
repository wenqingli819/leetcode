package recursion;

public class FindLarggestElement {
	public int findMax(int[] arr, int N) {
		if(N==1) {
			return arr[N];
		}
		if(N==2) {
			return arr[N-1] > arr[N]? arr[N-1]:arr[N];
		} 
		return findMax(arr,N-1);
	}
	
	
	public static void main(String[] args) {
		int[] arr = {2,4,13,5};
		int N = arr.length;
		FindLarggestElement solution = new FindLarggestElement();
		System.out.println(solution.findMax(arr,N));

	}


}



 