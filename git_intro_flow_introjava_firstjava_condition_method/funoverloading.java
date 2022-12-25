package git_intro_flow_introjava_firstjava_condition_method;
import java.util.Arrays;

public class funoverloading {
    public static void main(String[] args) {
        fun(57);
        fun("ansh");
        int ans = fun(12,54);
        System.out.println(ans);
        int ans1 = fun(15,5,8);
        System.out.println(ans1);
        lemo(45,656,5542);
        demo("ansh","abm");
    }

    static void lemo(int...v){
        System.out.println(Arrays.toString(v));

    }
    static void demo(String ...v){
        System.out.println(Arrays.toString(v));

    }
    static int fun(int a,int b,int c){
        return a + b + c;
    }
    static int fun(int a,int b){
        return a + b;
    }
    static void fun(int a){
        System.out.println(a);

    }
    static void fun(String name){
        System.out.println(name);
    }
}
