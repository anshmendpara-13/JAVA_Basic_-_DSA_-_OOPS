package git_intro_flow_introjava_firstjava_condition_method;
import java.util.Scanner;
//n % 10 = give a last digit
public class countinint {
    public static void main(String[] args) {
       Scanner input =  new Scanner(System.in);


       int count = 0;
       int n = input.nextInt();
       int number = input.nextInt();


       while(n>0) {
           int rem = n % 10;
           if (rem == number) {
               count++;
           }
           n = n / 10;
       }
           System.out.println(count);


    }
}
