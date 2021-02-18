package string.easy;

/*
 * Created by babydeveloper on 1/4/21.
 */
public class RightShiftByNCharacters {
    public static String rightShift(String input, int n){
        if(input.length()<=1){
            return input;
        }
        char[] array = input.toCharArray();
        n = n % array.length; // effective rotation
        // reverse in 3 steps, similar like reverse words in sentence
        // 1.反转数组的所有元素。  reverse all the elements of the array.
        // 2. 反转前k个元素。 reversing the first k elements
        // 3.然后反转其余 k-n个 元素  reversing the rest k−n elements
        reverse(array,0, array.length-1);
        reverse(array,0, n-1);
        reverse(array,n, array.length-1);
        return new String(array);
    }
    private static void reverse(char[] array, int left, int right){
        while(left < right){
            char tmp = array[left];
            array[left++] = array[right];
            array[right--] = tmp;
        }
    }
    public static void main(String[] args) {
        System.out.println(rightShift("abc", 0));
    }
}
