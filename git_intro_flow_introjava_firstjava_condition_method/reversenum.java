package git_intro_flow_introjava_firstjava_condition_method;
import java.util.Scanner;
public class reversenum {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);

        int ans = 0;
        int n = input.nextInt();

        while (n>0){
            int rem = n % 10;
            n = n / 10;
            ans = ans *10 +rem;
        }
        System.out.println(ans);

    }
}
