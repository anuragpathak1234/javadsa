import java.util.ArrayList;

public class CombinationOfPhoneNumber {

    public static void main(String[] args){

        ArrayList<String> ans =combinationOfPhoneNumber("","12");
        System.out.println(ans);


    }


    static ArrayList<String> combinationOfPhoneNumber(String p, String up){

        if(up.isEmpty()){

            ArrayList<String>list = new ArrayList<>();
            list.add(p);
            return list;

        }

        ArrayList<String> ans = new ArrayList<>();

        int digit = up.charAt(0) - '0';

        for(int i = (digit - 1) * 3 ; i < digit * 3; i++){

            char ch = (char)('a' + i);

         ArrayList<String> buttom =   combinationOfPhoneNumber(p + ch, up.substring(1));

         ans.addAll(buttom);
        }

        return ans;



    }










}
