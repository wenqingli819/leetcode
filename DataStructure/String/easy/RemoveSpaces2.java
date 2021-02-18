package DataStructure.String.easy;

/*
 * Created by babydeveloper on 12/31/20.
 */
public class RemoveSpaces2 {
    public static String removeSpaces(String input) {
        if (input.isEmpty()) return input;

        char[] array = input.toCharArray();
        int i = 0; // i: keep track of the index
        for (int j = 0; j < array.length; j++) { // j:check leading and middle spaces
            if (array[j] == ' ' && (j == 0 || array[j - 1] == ' ')) {
                continue;
            }
            array[i++] = array[j];
        }
        if (i > 0 && array[i - 1] == ' ') {
            return new String(array, 0, i - 1);
        }
        return new String(array, 0, i);
    }

    public static void main(String[] args) {
        String str = "   I     love books ";
        String str2 ="ILOVEYAHOO";
        System.out.println(removeSpaces(str));
        System.out.println(removeSpaces(str2));
    }
}
