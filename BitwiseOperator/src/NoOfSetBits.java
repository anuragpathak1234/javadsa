public class NoOfSetBits {

    public static void main(String[] args){

        int n  = 6;

        int ans = findNoOfSetBits(n);

        System.out.println(ans);
    }

    static int findNoOfSetBits(int n){

        int count  = 0;

        while( n   > 0){
            if((n & 1) == 1){
                count++;
            }

            n = n >> 1;
        }
        return count;
    }
}
