package DataStructure.String.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Created by babydeveloper on 1/21/21.
 *
 * "i love google"
 * "google love i"
 *
 * "i love google too"
 * "too google love i"
 */
public class ReverseWordsInSentence {
    public static String reverseWords(String input) {
        List<String> sList = new ArrayList<>(Arrays.asList(input.split(" ")));
        int j = sList.size()-1;
        for(int i = 0; i < sList.size()/2;i++ ){
            String tmp = sList.get(i);
            sList.set(i,sList.get(j));
            sList.set(j--, tmp);
        }
        return new String(sList.toString());
    }
    public static void main(String[] args) {
        String input = "i love google";
        System.out.println(reverseWords(input));
    }
}
