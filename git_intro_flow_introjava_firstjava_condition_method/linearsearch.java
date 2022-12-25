package git_intro_flow_introjava_firstjava_condition_method;
public class linearsearch {
    public static void main(String[] args) {
        int[] nums = {20, 56, -5, 5564, -54, 4, -78};
        int target = -5;
        int ans = linearSearch(nums, target);
        System.out.println(ans);

    }

 //    otherwise if item not found return -1
    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }


//        run a for loop
        for (int index = 0; index < arr.length; index++) {
//            check for element at every index
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
//        this line will execute if none of the return statement above have executed
//        hence the target not found
        return -1;
    }
}

