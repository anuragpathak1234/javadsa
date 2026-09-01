

import java.util.ArrayList;

public class SubString {

    public static void main(String[] args){

        subsequence("","abc");


    }

//    static void subsequence(String p, String up){
//        if(up.isEmpty()){
//            System.out.println(p);
//
//            return;
//        }
//
//        char ch = up.charAt(0);
//
//
//        subsequence(p + ch,up.substring(1));
//        subsequence(p,up.substring(1));
//
//    }
DA


    static ArrayList<String> subsequence(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();

            list.add(p);
            return list;


        }

        char ch = up.charAt(0);


        ArrayList<String> left =    subsequence(p + ch,up.substring(1));
        ArrayList<String> right =  subsequence(p,up.substring(1));

        left.addAll(right);

        return left;

    }
}
