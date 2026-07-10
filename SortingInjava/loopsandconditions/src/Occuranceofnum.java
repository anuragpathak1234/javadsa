public class Occuranceofnum {
    public static void main(String[] args){
        long  n = 123456789707L;
        int digit  = 7;


        int occurance = 0;

        while(n != 0){
            long rem = n % 10;

            if(rem == digit){
                occurance++;


            }
            n =  n/ 10;
        }

        System.out.println(occurance);



    }
}
