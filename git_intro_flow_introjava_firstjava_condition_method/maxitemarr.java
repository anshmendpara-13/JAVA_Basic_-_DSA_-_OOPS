package git_intro_flow_introjava_firstjava_condition_method;
public class maxitemarr {
    public static void main(String[] args) {
        int[] arr = {1,2,5,1,2,52,5,3,12};
//        System.out.println(max(arr));
        System.out.println(maxrange(arr,1,2));
    }

////   imagine that arr is not empty
//    static int max(int[] arr){
//        int maxval = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i]>maxval){
//                maxval = arr[i];

//    work on edge cases here, like array being null
                static int maxrange(int[] arr, int start, int end){

//                    if(end >start){
//                        return -1;
//                    }
//                    if (arr == null){
//                        return -1;
//                    }
                    int maxval = arr[start];
                    for (int i = start; i <= end; i++) {
                        if (arr[i]>maxval){
                            maxval = arr[i];
            }
        }
//        return maxval;
                    return maxval;
    }
}
