package sort;

/*
 * Created by babydeveloper on 2/11/21.
 */
public class MergeSort {
    public int[] mergeSort(int[] array){
        if(array==null){
            return array;
        }
        int[] buffer = new int[array.length];
        mergeSort(array,buffer,0,array.length-1);

        return array;
    }

    private void mergeSort(int[] array, int[] buffer, int left, int right) {
        for(int i = left; i <= right; i++){
            buffer[i] = array[i];
        }
        int leftIndex = left;
        int rightIndex  = mid+1;
        while(leftIndex <= mid){
            array[left++] = buffer[leftIndex++];
        }
    }

  public static void main(String[] args) {
      MergeSort solution = new MergeSort();

      int[]array = null;
      System.out.println(solution.mergeSort(array));
  }
}
