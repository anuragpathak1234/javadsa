public class Sum {

    public static void main(String[] args){

        int ans = SumOf1ToN(10);

        System.out.println(ans);
    }

    static int SumOf1ToN(int n){

        if(n == 1){
            return 1;
        }

        return n + SumOf1ToN(n - 1);
    }
}
