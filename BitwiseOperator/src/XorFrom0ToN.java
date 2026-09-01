public class XorFrom0ToN {

    public static void main(String[] args){

        int n = 10;

        int ans  = Xor(n);

        System.out.println(ans);
    }

    static int Xor(int n){

        if(n % 4  == 0){
            return n;
        }

        else if(n % 4 == 1){
            return 1;
        }

        else if(n % 4 == 2){
            return n + 1;
        }

        else{
            return 0;
        }
    }
}
