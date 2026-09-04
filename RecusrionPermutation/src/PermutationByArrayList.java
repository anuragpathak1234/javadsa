import java.util.ArrayList;

public class PermutationByArrayList {

    public static void main(String[] args){

        ArrayList<String> ans = permutation("","abc");

        System.out.println(ans);



    }

    static ArrayList<String> permutation(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();

            list.add(p);

            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 0; i <= p.length(); i++){

            char ch = up.charAt(0);

            String first = p.substring(0,i);
            String second = p.substring(i,p.length());

            ans.addAll(permutation(first + ch + second, up.substring(1)));
        }

        return ans;
    }
}
