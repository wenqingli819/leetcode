package prac;

import java.util.HashMap;
import java.util.Map;

public class SmallestIndexOfLargestNum {

	public static void main(String[] args) {
		
		int[] myList = {3,2,4,2,1,4,1,3};
		
		// random values between 0.0 and 100.0
//		for(int i = 0; i < myList.length; i++){
//			
//			myList[i] = (int) (Math.random()*100);
//		}
//		for(int i = 0; i < myList.length;i++) {
//			System.out.println(myList[i] + " ");
//		}
//		
		System.out.println("");

		int max = myList[0];
		int indexOfMax = 0;
		
		for(int i = 1; i < myList.length; i++){
			if(myList[i] > max){
				max = myList[i];
				indexOfMax = i;

			}
			
		}


		System.out.println(indexOfMax);

	}
}
