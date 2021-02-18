package DataStructure.String.easy;

/*
 * Created by babydeveloper on 1/2/21.
 */
public class ConvertCharToInt {
    public static void main(String[] args) {

        String s = "321";
        int a = 0;
        for(char ch: s.toCharArray()) {
            System.out.println("char value: " + ch);
            // Converting ch to it's int value
            a = a*10+ ch - '0';
            System.out.println("int value: " + a);
        }

    }
}
