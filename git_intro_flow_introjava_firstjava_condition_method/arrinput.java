package git_intro_flow_introjava_firstjava_condition_method;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class arrinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        int[] arr = new int[5];
//        arr[0] = 23;
//        arr[1] = 223;
//        arr[2] = 238;
//        arr[3] = 233;
//        arr[4] = 235;
//        // [23,223,238,233,235]
//        System.out.println(arr[3]);

//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }

//        best print method

//        System.out.println(Arrays.toString(arr));

//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }

//        for (int j : arr) {   //here j represents element of the array
//            System.out.print(j + " "); // for every element in array print the element

//        System.out.println(arr[5]);  // index out of bound error


        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = input.next();
        }
        System.out.println(Arrays.toString(str));

//        modify
        str[1] = "mednpara";
        System.out.println(Arrays.toString(str));



        }

    }


