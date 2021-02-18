package laioffer;
public class SmallestNumLargerThanTarget {

	public static int smallestNumLargerThanTarget(int[]array, int target) {
	  if(array == null || array.length == 0){
	      return -1;
	    }
	    int start = 0;
	    int end  = array.length-1;
	    while(start < end-1){
	      int mid = start+(end-start)/2;
	      if(array[mid] <= target){
	        start = mid + 1;
	      }else{
	        end = mid;
	      }
	    }
	    if(array[start]>target){
	      return start;
	    } else if (array[end]>target){
	      return end;
	    }
	    return -1;
	  }
		
		
	public static void main(String[] args) {
		int []array = {1,3,4,5,8,9};
		int target = 7;
		System.out.println(smallestNumLargerThanTarget(array, target));
		

	}

}



