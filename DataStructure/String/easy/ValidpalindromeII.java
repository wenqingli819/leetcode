package DataStructure.String.easy;

/*
 * Created by babydeveloper on 1/1/21.
 * Given a non-empty string s, you may delete at most one character.
 * Judge whether you can make it a palindrome.
 */
public class ValidpalindromeII {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length()-1;

        while(i<j){
            if(s.charAt(i) !=s.charAt(j)){
                // add another palimdrom check, simulate removing i+1 char or j-1 char
                return isPalindrome(s,i+1,j) ||isPalindrome(s,i,j-1);
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isPalindrome(String s, int i, int j){
        while(i<j){
            if(s.charAt(i++) != s.charAt(j--)){
                return false;
            }
        }
        return true;
    }
}
