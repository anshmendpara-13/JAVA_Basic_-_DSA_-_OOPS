package git_intro_flow_introjava_firstjava_condition_method;
import java.util.Scanner;
public class nestedswitchuse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int empid = input.nextInt();
        String department = input.next();

            switch (empid) {
                case 1:
                    System.out.println("ansh mendpara");
                    break;
                case 2:
                    System.out.println("prit monpara");
                    break;
                case 3:
                    switch (department) {
                        case "it" -> System.out.println("it department");
                        case "ngo" -> System.out.println("ngo department");
                        default -> System.out.println("Enter right deaprtment");
                    }
                break;
                default:
                System.out.println("Enter right name");


        }
    }


}

