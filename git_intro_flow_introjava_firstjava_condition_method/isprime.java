package git_intro_flow_introjava_firstjava_condition_method;
import java.util.Scanner;
public class isprime {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int n = input.nextInt();
        System.out.println(isprime(n));
    }
    static boolean isprime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if (n % c == 0){
                return false;
            }
            c++;
        }
        if (c * c > n){
            return true;
        }
        return false;
    }
}
