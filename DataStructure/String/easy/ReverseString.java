package DataStructure.String.easy;

/*
 * Created by babydeveloper on 12/29/20.
 */
public class ReverseString {
        public static String reverse(String input) {
            // Write your solution here
            StringBuilder sb = new StringBuilder();
            char[] arrayInput = input.toCharArray();
            // 2,1,0
            for(int i = arrayInput.length-1; i >= 0; i--){
                sb.append(arrayInput[i]);
            }
            return sb.toString();
        }

    public static void main(String[] args) {
        System.out.println(ReverseString.reverse("abc"));
    }
}
