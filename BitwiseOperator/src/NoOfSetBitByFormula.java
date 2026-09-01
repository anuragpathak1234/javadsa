public class NoOfSetBitByFormula {

    public static void main(String[] args){

        int n = 9;
        int ans = findNoOfSetBit(n);

        System.out.println(ans);
    }

    static int findNoOfSetBit(int n){

        int count = 0;

        while(n  >  0){

            int RightMostSetBit = n & (-n);

            n = n - RightMostSetBit;
            count++;
        }
        return count;
    }
}
