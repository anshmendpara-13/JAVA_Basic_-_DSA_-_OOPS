
package git_intro_flow_introjava_firstjava_condition_method;
import java.util.Arrays;

public class varargs {
    public static void main(String[] args) {
        fun(1,5,4,5,2,2,2,2,1,5,5);
        multiple(4,5,"asj");
    }
    static void multiple(int a,int b,String...v){
        System.out.println(Arrays.toString(v));
    }

    static void fun(int...v){
        System.out.println(Arrays.toString(v));
    }
}
