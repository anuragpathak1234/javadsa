import java.util.Scanner;

public class Scope {
    public static void main(String[] args){

        int a  = 10;
        int b = 12;

        {

//           int a = 78; // already initialized outside the block in the same method, hence you can not initialized again
            a = 100; // reassin the original ref variable to some other value, this is valid
            System.out.println(a);
            int c = 99;
            // value initialized in this block, will remain in block;
        }

        System.out.println(a);



        //System.out.printrln(c); // cannot use outside the block;
//
//        int ans = swap(a, b);
//        System.out.println(ans);

    }

//    static void swap(int a,  int b){
//        int temp = a;
//        a = b;
//        b = temp;
        //this change will only be valid in this function scope only
//    }




}
