package prac;

import java.util.Arrays;

public class ShiftingElements {
	public static void main(String[] args) {
		int[] myList = {3,2,4,2,1,4,1,3};	
		//retrain the 1st element
		int temp = myList[0];
		
		//shift elements left
		for(int i = 1; i < myList.length; i++) {
			myList[i] = temp;
			temp = myList[i];
		}
		System.out.println(Arrays.toString(myList));
	}
}
