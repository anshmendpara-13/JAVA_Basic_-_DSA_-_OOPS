package git_intro_flow_introjava_firstjava_condition_method;
public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
//        swap number code
//        int temp = a;
//        a = b;
//        b = temp;
        swap(a,b);
        System.out.println(a + " " + b);

        String name = "ansh mendpara";
        changename(name);
//        only value are copy and store, variable not a change
        System.out.println(name);
    }

    static void changename(String naam){
        naam = "neev popat";
//        string are immutable
//        you are not change old object variabel you create the new object and give the new value
    }

    static void swap(int a,int b){
        int temp = a;
        a = b;
        b = temp;

//        this change will only be valid in this function scope only.
    }
}
