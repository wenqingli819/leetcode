package sort;

import java.util.Arrays;

/*
 * Created by babydeveloper on 2/10/21.
 */
public class SelectionSort {
    public static int[] selectionSort(int[] arr){
        int min; // min index

        for(int i = 0; i < arr.length-1; i++){
            min = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[j] < arr[min]){
                    min = j;
                }
            }
            swap(arr,i,min);
        }
        return arr;
    }

    private static void swap(int[] arr, int i, int min) {
        int tmp = arr[i];
        arr[i] = arr[min];
        arr[min] = tmp;
    }

    public static void main(String[] args) {
        int[] arr = new int []{4,3,2,7,9};
        System.out.println(Arrays.toString(selectionSort(arr)));

    }
}
