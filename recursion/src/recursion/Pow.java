package recursion.src.recursion;

/*
 * Created by babydeveloper on 2/10/21.
 */
public class Pow {
    public static int pow(int a, int b){
        if(b==0){
            return 1;
        }
        // call b/2
        int half = pow(a,b/2);
        if(b%2==0){
            return half*half;
        }else{
            return half*half*half;
        }
    }
    public static void main(String[] args) {
        System.out.println(pow(2,5));
        System.out.println(pow(2,4));
        System.out.println(pow(2,0));
  }
}
