package git_intro_flow_introjava_firstjava_condition_method;
public class scopping {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "ash";
        System.out.println();
//          int a = 75: // already initilise outside the block in the same method hence you cannot initialise again but you can chage
//        you are change the value but you are not the change same name variable
        {
            a = 75; // reassign the original ref variable to some othe value
            int c = 99;
            name = "neev";
            System.out.println(a);
            System.out.println(name);
//            values initilised in this block will remain in block
        }
        int c = 300;
//        System.out.println(c);
        System.out.println(a);
        System.out.println(name);

//        scoping in for loops
        for (int i = 0 ;i<4 ; i++){
            System.out.println(i);
            int num = 90;
//            int a = 10;
        }

    }
    static void random(int marks){
        int num = 65;
        System.out.println(marks);
        System.out.println(num);
    }
}
