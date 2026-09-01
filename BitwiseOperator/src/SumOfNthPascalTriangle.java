public class SumOfNthPascalTriangle {
    public static void main(String[] args){

        int n  = 4;

        int ans = FindSumOfNthPascalTriangle(n);

        System.out.println(ans);
    }

    static int FindSumOfNthPascalTriangle(int n){
        return 1 << n;
    }

}
