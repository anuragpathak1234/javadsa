import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class ArraylistExample {

    public static void main(String[] args){

//        ArrayList<Integer> list = new ArrayList<>(10);
//
//        list.add(67);
//        list.add(79);
//        list.add(79);
//        list.add(80);
//        list.add(238);
//        list.add(39);
//        list.add(576);
//        list.add(687);
//        list.add(78);
//        list.add(90);
//        list.add(89);
//        list.add(1);
//
//
//        System.out.println(list.contains(80));
//        list.set(0,100);
//        System.out.println(list);
//
//        System.out.println(list.remove(0));
//        System.out.println(list.size());
//
//        list.clear();
//        System.out.println(list);
//
//        System.out.println(list.isEmpty());

//        list.add(1,111);
//        System.out.println(list);
//
//        Collections.sort(list);
//        System.out.println(list);

        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        // initialization
        for(int rows = 0; rows < 3; rows ++){
            list.add(new ArrayList<>());
        }

        // add elements

        for(int rows = 0; rows < 3; rows++){
            for(int col = 0; col < 3; col++){

                list.get(rows).add(input.nextInt());
            }

        }

        // printing the elements
//        for(int rows = 0; rows < 3; rows++){
//            System.out.println(list.get(rows));
//        }

//        for(int rows = 0; rows < list.size(); rows ++){
//            for(int col = 0; col < list.get(rows).size(); col++){
//                System.out.print(list.get(rows).get(col) + " ");
//            }
//
//            System.out.println();
//        }

        for(ArrayList<Integer> rows : list){
            for(int num : rows){
                System.out.print(num + " ");
            }

            System.out.println();
        }




    }
}
