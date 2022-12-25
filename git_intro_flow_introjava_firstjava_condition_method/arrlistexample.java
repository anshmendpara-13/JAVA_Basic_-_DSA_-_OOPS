package git_intro_flow_introjava_firstjava_condition_method;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class arrlistexample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        syntex
        ArrayList<Integer> list = new ArrayList<>(5);
//        list.add(13);
//        list.add(2003);
//        list.add(25);
//        list.add(07);
//
//        System.out.println(list.contains(13));
//        System.out.println(list);
//        list.set(0,103);
//        System.out.println(list);
//        list.remove(3)
//        System.out.println(list);

//        input
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
//        get item at any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));  //pass index here, list[index] syntex will not work

        }
        System.out.println(list);
    }

//    use rapper class in primitive data tyoe
}
