package git_intro_flow_introjava_firstjava_condition_method;
import java.util.Scanner;
public class sumfunction {
    public static void main(String[] args) {

//        sum();
//        int ans =  sum2();
//        System.out.println(ans);
        int ans = sum3(10,50);
        System.out.println(ans);
    }

//    return the value
    static int sum2(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = input.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
//        System.out.println("The sum = " + sum);
        return sum;
    }

//   static void sum(){
//         Scanner input = new Scanner(System.in);
//        System.out.println("Enter number 1 : ");
//        int num1 = input.nextInt();
//        System.out.println("Enter number 2 : ");
//        int num2 = input.nextInt();
//        int sum = num1 + num2;
//        System.out.println("The sum = " + sum);
//    }

//  pass the value of numbers when you are calling the method in main()
    static int sum3(int a, int b){
        int sum = a + b;
        return sum;
    }


    /*
    access modifier (we'll look in oop) return_type name(){
     //  body
     return statement;
     }
    */
}
