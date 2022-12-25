package git_intro_flow_introjava_firstjava_condition_method;
public class basicarray {
    public static void main(String[] args) {
//      syntax
//        datatype[] variable_name = new datatype[size];
//        example: store 5 roll number

//        int[] rn = new int[5];
//        or directly
//        int[] rn1  = {10,20,30,10,20};

        int[] ros; // declaration of array. ros is getting defined in the stack
//        compile time
        ros = new int[5]; //initialisation: actually her object is being created in the memory(heap)
//       run time
        System.out.println(ros[0]);

//        bydefault in integer element are 0
//        bydefault in String element are null
//        null are literal
//        null assign in to  non-primitive
//        you are not create variable which name is null
//        in python bydefault element are none

//        primitive store in stack memory
//        another ane store in heap memory



//        String[] arr = new String[4];
//        System.out.println(arr[0]);


    }
}
/* this is important notes */

//all memory store in the heap in the array and objects
//heap object are not continuous
//c and c++ are continuous
//DMA
//array objects are not be continuous depend on jvm-java vartual machine
//indexing start to 0
//new -  use to create an object


