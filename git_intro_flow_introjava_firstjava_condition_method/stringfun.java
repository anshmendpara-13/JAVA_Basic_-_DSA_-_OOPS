package git_intro_flow_introjava_firstjava_condition_method;
import javax.imageio.spi.ImageInputStreamSpi;
import java.util.Scanner;
public class stringfun {
    public static void main(String[] args) {
//        String message = greet();
//        System.out.println(message);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name :- ");
        String name = input.nextLine();
        String personlised = mygreet(name);
        System.out.println(personlised);

    }

    static String mygreet(String name){
        String message = "hello " + name;
        return message;
    }

    static String greet(){
        String greeting = "how are you?";
        return greeting;
    }
}
