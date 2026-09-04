public class Permuation {

    public static void main(String[] args){

        permutation("","abc");


    }

    static void permutation(String p, String up){
        if(up.isEmpty()){

            System.out.println(p);
            return ;
        }

        for(int i = 0; i <= p.length(); i++){

            char ch = up.charAt(0);

            String first = p.substring(0,i);
            String second = p.substring(i, p.length());


            permutation(first + ch + second,up.substring(1));
        }


    }


}
