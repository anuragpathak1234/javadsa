public class ReverseNumber {



//    static int sum = 0;
//    static void rev1(int n){
//
//        if(n == 0){
//            return;
//        }
//
//        int rem = n % 10;
//        sum = sum * 10  + rem;
//
//        rev1(n / 10);
//
//    }

    static int rev2(int n){

        //sometimems you might need some additionalvariable in argument
        //in case that,  make another function

        int digits = (int)(Math.log10(n))  + 1;

        return helper(n,digits);

    }

    private static int helper(int n, int digits){

        if(n % 10 == n){
            return n;
        }

        int rem = n % 10;

        return rem * (int)Math.pow(10, digits - 1) + helper(n / 10, digits - 1);
    }





    public static void main(String[] args){

        int n = 1342;



//        rev1(n);
//
//        System.out.println(sum);

        System.out.println(rev2(n));



    }





}
