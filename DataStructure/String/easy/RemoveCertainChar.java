package DataStructure.String.easy;
import java.util.*;
/*
 * Created by babydeveloper on 12/31/20.
 */
public class RemoveCertainChar {
    public static String removeChar(String input, String t){
        char[] arr= input.toCharArray();
        Set<Character> set = buildSet(t);
        int slow = 0;
        //  s
        //"ccbd"
        //   f
        for(int fast = 0; fast < arr.length; fast++){
            if (!set.contains(arr[fast])){
                arr[slow++] = arr[fast];

            }
        }
        return new String(arr).substring(0,slow);

    }

    private static Set<Character> buildSet(String t) {
        Set<Character> set = new HashSet<>();
        for(int fast = 0; fast < t.length(); fast++){
            set.add(t.charAt(fast));
        }
        return set;
    }

    public static void main(String[] args) {
        String input= "acbd";
        String t = "ab";
        System.out.println(removeChar(input,t));
    }
}
