public class MagicNumber {
    public static void main(String[] args){
        // What is magic number
        // we have to take binary digit of number and multiply all bit by power of 5
        int n = 6;

        int ans = findMagicNum(n);
        System.out.println(ans);



    }

    static int findMagicNum(int n){

        int ans = 0;

        int base = 5;

        while(n  > 0){
            int last = n  & 1;
            n = n >> 1;

            ans = ans  + last * base;
            base = base  * 5;
        }
        return ans;
    }

}
