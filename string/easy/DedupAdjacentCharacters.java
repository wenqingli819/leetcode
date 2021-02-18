package string.easy;

/*
 * Created by babydeveloper on 12/29/20.
 * https://app.laicode.io/app/problem/79 Remove Adjacent Repeated Characters fast
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 * “aaaabbbc” is transferred to “abc”
 */
public class DedupAdjacentCharacters {
    public static String deDup(String input) {
        if (input == null || input.length() == 0) return input;
        char[] chars = input.toCharArray();
        char prev = ' '; // '/0' means zero character
        int i = 0;
        for (char c: chars) {
            if (prev != c) {
                chars[i++] = c;
                prev = c;
            }
        }

        return new String(chars).substring(0, i);
    }

    public static void main(String[] args) {
        System.out.println(DedupAdjacentCharacters.deDup("aa"));

    }

}
