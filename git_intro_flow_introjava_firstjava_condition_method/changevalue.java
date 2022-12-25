package git_intro_flow_introjava_firstjava_condition_method;
import java.util.Arrays;

public class changevalue {
    public static void main(String[] args) {
        //    create an array
        int[] arr = {1,2,3,4,5};
        change(arr);
//        all are object
//        in java no pointer and no address
        System.out.println(Arrays.toString(arr));
    }
//    string array get int value and return the string
    static void change(int[] num){
        num[0] = 99;
//      if you make a change to the object via this ref variable, same object will be changed


    }

}
