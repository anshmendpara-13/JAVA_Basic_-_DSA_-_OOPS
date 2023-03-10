package git_intro_flow_introjava_firstjava_condition_method;
import java.util.Arrays;
public class bubbleshort {
    public static void main(String[] args) {
        int[] arr = {12,-96,0,45,-8};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void bubble(int[] arr){
        boolean swapped;
        // run the steps n-1 times
        for (int i = 0; i < arr.length; i++){
            swapped = false;
            // for each step, max item will come at the lst respective index
            for (int j = 1; j < arr.length - i; j++){
               // swap if the item is smaller than the previous item
               if (arr[j] < arr[j-1]){
                   //swap
                   int temp = arr[j];
                   arr[j] = arr[j-1];
                   arr[j-1] = temp;
                   swapped = true;
               }
            }
            // if you did not swap for a particular value of i, it means the array id sorted hence stop the program
            if(!swapped){
                break;
            }
        }

    }

}
