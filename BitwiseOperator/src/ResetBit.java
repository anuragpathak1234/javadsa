public class ResetBit {

    public static void main(String[] args){

        int n  = 13;
        int position = 3;

        int result = resetBit(n, position);

        System.out.println("Original Number : " + n);

        System.out.println("Original Binary : " + Integer.toBinaryString(n));


        System.out.println("Position to Reset : " + position);

        System.out.println("New number : " + result);

        System.out.println("New Binary : " + Integer.toBinaryString(result));
    }

    static int resetBit(int n, int position){

        int mask = (1 << (position - 1));
        int invertedmask = ~mask;

        return n & invertedmask;
    }
}
