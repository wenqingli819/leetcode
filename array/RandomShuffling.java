package prac;

import java.util.Arrays;

public class RandomShuffling {

	public static void main(String[] args) {
		int[] myList = {3,2,4,2,1,4,1,3};
		System.out.println(Arrays.toString(myList));
		
		for(int i = 0; i < myList.length;i++ ) {
			
			//j:random index 
			int j = (int)(Math.random()*myList.length);
			
			int temp = myList[i];
			myList[i] = myList[j];
			myList[j] = temp;
		}
		System.out.println(Arrays.toString(myList));
	}

}
