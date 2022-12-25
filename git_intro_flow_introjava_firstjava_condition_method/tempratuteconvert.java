package git_intro_flow_introjava_firstjava_condition_method;
import java.util.Scanner;
public class tempratuteconvert {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the temp in C :- ");
        float tempC = input.nextFloat();
        float tempF = ((tempC * 9/5) + 32);
        System.out.println(tempF);
    }

}
