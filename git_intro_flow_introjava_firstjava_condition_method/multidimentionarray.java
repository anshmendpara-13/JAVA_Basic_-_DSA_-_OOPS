package git_intro_flow_introjava_firstjava_condition_method;
import java.util.Arrays;
import java.util.Scanner;

public class multidimentionarray {
    public static void main(String[] args) {
        /*
                1 2 3
                4 5 6
                7 8 9
         */
        Scanner input = new Scanner(System.in);

//        int[][] arr =  new int[3][3];
//        number of raw mendetory
//        int[][] arr = {
//                {1,2,3}, // 0th index
//                {4,5},  // 1st index
//                {6,7,8,9}  //2nd index
//                imagine this is array of array
//        };

        int[][] arr = new int[3][3];
//        System.out.println(arr.length);
//         give the no of rows

//        input
        for (int row = 0; row < arr.length; row++){
//            for each col in every row
            for (int col = 0; col < arr[row].length; col++){
                arr[row][col] = input.nextInt();
            }
        }

//        output
//        for (int i = 0; i < arr.length; i++) {
//            int[] ints = arr[i];
////            for each col in every row
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }

//        output 1
//        for (int row = 0; row < arr.length; row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

//        output 2
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }

    }
}
