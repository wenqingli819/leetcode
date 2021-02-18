package DataStructure.String.easy;

/*
 * Created by babydeveloper on 1/11/21.
 * i
 * abbaca

 *
 * @return: "ca"
 */
public class RemoveAllAdjacentDuplicatesInString1047 {
    public static String removeDuplicates(String S) {
        if(S.isEmpty() || S == null){
            return null;
        }

        // convert input string to char arr
        char[] arr =S.toCharArray();
        char prev = ' ';
        int i = 0;

        for(char current: arr){
            if(current!= prev) {
                arr[i] = current;
                prev = current;
                i++;
            }
        }
        return new String(arr).substring(0,i);
    }

    public static void main(String[] args) {
        String s = "abbcc";
        String s1 = "aa";
        System.out.println(removeDuplicates(s));
        System.out.println(removeDuplicates(s1));
    }
}
