public class ProductOfDigits {

    public static void main(String[] args){

        int n = 1342;

        int product = productofdigits(n);

        System.out.println(product);
    }

    static int productofdigits(int n){

        if(n == 1){
            return 1;
        }

        return n % 10 * productofdigits(n / 10);
    }
}
