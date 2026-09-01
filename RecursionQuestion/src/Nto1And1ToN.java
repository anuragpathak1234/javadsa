public class Nto1And1ToN {

    public static void main(String[] args){

        nTo1And1Ton(5);
    }

    static void nTo1And1Ton(int n){

        if(n == 0){
            return;
        }

        System.out.println(n);

        nTo1And1Ton( n- 1);

        System.out.println(n);
    }
}
