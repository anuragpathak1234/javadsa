public class SetIthBit {

    public static void main(String[] args){

        int n = 13;
        int position = 2;

        int result = setBit(n,position);

        System.out.println("Original Number : " + n);

        System.out.println("Original Binary : " + Integer.toBinaryString(n));

        System.out.println("Psition To Set : " + position);

        System.out.println("New Number : " + result);
        System.out.println("New Binary :  " + Integer.toBinaryString(result));
    }

    static int setBit(int n, int position){

        return n | (1 << (position - 1));
    }
}
