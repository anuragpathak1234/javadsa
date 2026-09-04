public class CountNumberOfPermutation {


    public static void main(String[] args){

        System.out.println(countpermutation("","abcd"));


    }

    static int countpermutation(String p, String up){

        if(up.isEmpty()){
            return 1;
        }


        int count = 0;

        for(int i = 0; i <= p.length(); i++ ){

            char ch = up.charAt(0);

            String first = p.substring(0,i);
            String second = p.substring(i,p.length());

            count = count + countpermutation(first + ch + second, up.substring(1));
        }

        return count;
    }
}
