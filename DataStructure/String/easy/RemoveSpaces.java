package DataStructure.String.easy;

/*
 * Created by babydeveloper on 12/30/20.
 */
public class RemoveSpaces {
    public static String removeSpaces(String input) {
        if(input == null || input.length() == 0){
            return input;
        }
        String res = input.replaceAll("\\s+"," ").trim();
        return res;
    }
    public static void main(String[] args) {
        String str = "   fast     love MTV ";
        String str2 ="ILOVEYAHOO";
        System.out.println(removeSpaces(str));
        System.out.println(removeSpaces(str2));



    }
}
