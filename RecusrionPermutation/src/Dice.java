import java.util.ArrayList;

import static java.util.Collections.addAll;

public class Dice {

    public static void main(String[] args){
        System.out.println(dice("",4));

    }

    static ArrayList<String> dice(String p, int target){

        if(target == 0){
          ArrayList<String> list = new ArrayList<>();

          list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();

        for(int i = 1; i <= 6 && i <= target; i++){

            ArrayList<String> answer_bottom   = dice(p + i, target -i);

            ans.addAll(answer_bottom);

        }

        return ans;
    }
}
