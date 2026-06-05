public class Reversenum {
    public static void main() {
        int n = 12345;
//        while(n > 0){
//            int temp =  n % 10;
//            System.out.print(temp + " ");
//            n = n / 10;
//        }
      int  ans = 0;
        while(n > 0){
            int rem = n % 10;
            n = n / 10;
             ans = ans * 10 + rem;
            System.out.print(ans + " ");
        }



    }
}
