package string.easy;
import java.util.*;
/*
 * Created by babydeveloper on 12/29/20.
 */
public class ReverseOnlyVowels {
    public static String reverse(String input) {
        //012345
        //abbegi    input

        if(input == null || input.length() == 0) return input;
        Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        char[] arrayInput = input.toCharArray();

        int i = 0;
        int j = arrayInput.length-1;

        while(i<j){
            if(!vowels.contains(arrayInput[i])){
                i++;
            }else if(!vowels.contains(arrayInput[j])){
                j--;
            }else {
                swap(arrayInput, i, j);
                i++;
                j--;
            }
        }
        return new String(arrayInput);
    }

    private static void swap(char[]arrayInput,int i, int j) {
        char tmp = arrayInput[i];
        arrayInput[i] = arrayInput[j];
        arrayInput[j] = tmp;
    }

    public static void main(String[] args) {
        System.out.println(ReverseOnlyVowels.reverse("leetcode"));
        System.out.println(ReverseOnlyVowels.reverse("hello"));
        System.out.println(ReverseOnlyVowels.reverse("oxygen"));

    }
}

