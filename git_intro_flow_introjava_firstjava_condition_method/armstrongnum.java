package git_intro_flow_introjava_firstjava_condition_method;
import java.util.Scanner;
public class armstrongnum {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int income  = input.nextInt();
//        System.out.println(income);

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)){
                System.out.println(i + " ");
            }
//            System.out.println(i + " ");
        }
    }
//     print all the 3 digit armstrong numbers
    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n>0){
            int rem = n % 10;
            sum = sum + (rem*rem*rem);
        }
            return sum == original;
        }

    }



