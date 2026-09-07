public class CountNumberOfCombination {

    public static void main(String[] args){

        System.out.println(countNumberOfCombination("","12"));

    }

    static int countNumberOfCombination(String p, String up){

        if(up.isEmpty()){
            return 1;

        }

        int count = 0;

        int digit = up.charAt(0) - '0';

        for(int i = (digit - 1) * 3; i < digit * 3; i++){

            char ch = (char)('a' + i);

            count = count + countNumberOfCombination(p + ch,up.substring(1));
        }
        return count;
    }
}
