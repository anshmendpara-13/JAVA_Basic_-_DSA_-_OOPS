package git_intro_flow_introjava_firstjava_condition_method;
import java.util.Scanner;
public class charisupordown {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char ch = input.next().trim().charAt(0);
        System.out.println(ch);

        if (ch >= 'a' && ch <= 'z'){
            System.out.println("Lower Case");
        } else {
            System.out.println("Upper Case");
        }
    }
}
