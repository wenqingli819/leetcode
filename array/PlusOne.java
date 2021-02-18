package array;

import java.util.Arrays;

/*
 * Created by babydeveloper on 1/22/21.
 *         i
   Input: [5, 6]  two digits with no carry
   Output:[5, 7]

   Input: [9, 9]  two digit with 1 carry, and the output will be 3 digits
   Output:[1, 0, 0]

   Input: [3, 9, 9]  three digits with 2 carry
   Output:[4, 0, 0]
 */
public class PlusOne {
    public static int[] plus(int[] digits) {
        // from end to begin, plus 1
        int carry = 0;
        int[] res = new int[digits.length];
        for(int i = digits.length-1; i >= 0; i--){
            // only the first round
            if(i == digits.length-1){  //
                res[i] = digits[i]+1;  //7
            }
            // other rounds
            else {
                res[i] = digits[i] + carry;  //5
                if(carry!=0){
                    carry-=1;
                }
            }
            if(res[i]>=10){
                res[i] = res[i]%10; //0,0
                carry+=1; //1,1
            }
        }
        if(carry!=0){
            int[] addedOneDigitRes = new int[digits.length+1];
            addedOneDigitRes[0] = 1;
            int j = 1;
            for(int i = 0;i < res.length; i++){
                addedOneDigitRes[j] = res[i];
            }
            return addedOneDigitRes;

        }
        return res;

    }

    public static void main(String[] args) {
        int[] input = {3,9,9};
        System.out.println(Arrays.toString(plus(input)));

    }
}
