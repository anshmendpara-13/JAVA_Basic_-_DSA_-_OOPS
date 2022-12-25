package git_intro_flow_introjava_firstjava_condition_method;
import java.util.Scanner;
public class calculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int ans = 0;
        while (true) {
//        take the operator as input
            System.out.println("Enter the operation :- ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%' || op == 'x' || op == 'X') {


//            input two numbers
                System.out.println("Enter the two numbers :-");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                System.out.println();

                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
                if (op == '%') {
                    ans = num1 % num2;
                }
                if (op == 'x' || op == 'X') {
                    break;
                }
                else {
                    System.out.println("Invalid operation");
                }
            }
            System.out.println(ans);
        }
    }
}
