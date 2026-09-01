public class FindiThBit {

    public static void main(String[] args){

        int n = 13;
        int position = 2;

        System.out.println("Number " +   n);
        System.out.println("Binary " + Integer.toBinaryString(n));
        System.out.println("Position " + position);

        int result_1  = findsBitUsingRightShift(n,position);
        int result_2 = findsBitUsingMask(n,position);

        System.out.println("Using Right Shift " + result_1);
        System.out.println("Using Left Shift mask " + result_2);


    }

    static int findsBitUsingRightShift(int n, int position){

        return (n >>  (position - 1)) & 1;
    }

    static int findsBitUsingMask(int n, int position){

        int mask = (1 << (position - 1));

        if((n & mask) == 0){
            return 0;
        }
        return 1;
    }
}
