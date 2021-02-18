package string.easy;

/*
 * Created by babydeveloper on 1/1/21.
 * an apple, :) elp pana#   //YES
 * dia monds dn dia   //NO
 */
public class ValidPalindrome {
    public static boolean isPalindrome(String s){
        if(s==null){
            return false;
        }
        int i=0;
        int j=s.length()-1;

        while(i<j){
            while((i<j) && !Character.isLetterOrDigit(s.charAt(i))){
                i++;
            }
            while((i<j) && !Character.isLetterOrDigit(s.charAt(j))){
                j--;
            }
            if(Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
