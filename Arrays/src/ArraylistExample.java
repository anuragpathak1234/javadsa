import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArraylistExample {

    public static void main(String[] args){

        ArrayList<Integer> list = new ArrayList<>(10);

        list.add(67);
        list.add(79);
        list.add(79);
        list.add(80);
        list.add(238);
        list.add(39);
        list.add(576);
        list.add(687);
        list.add(78);
        list.add(90);
        list.add(89);
        list.add(1);


        System.out.println(list.contains(80));
        list.set(0,100);
        System.out.println(list);

        System.out.println(list.remove(0));
        System.out.println(list.size());

        list.clear();
        System.out.println(list);

        System.out.println(list.isEmpty());

        list.add(1,111);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
    }
}
