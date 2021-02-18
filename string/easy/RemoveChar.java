package string.easy;
import java.util.*;
/*
 * Created by babydeveloper on 12/30/20.
 */
public class RemoveChar {
    public static String remove(String input, String t) {
        char[] array = input.toCharArray();
        Set<Character> set = buildSet(t);
        int slow = 0;

        for(int fast = 0; fast < array.length; fast++){
            if(!set.contains(array[fast])){
                array[slow++] = array[fast];
            }
        }
        return new String(array,0,slow);
    }
    private static Set<Character> buildSet(String t) {
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < t.length(); i++){
            set.add(t.charAt(i));
        }
        return set;
    }
    public static void main(String[] args) {
        String input = "cadbc";
        String t = "ab";
        System.out.println(remove(input,t));

    }
}
