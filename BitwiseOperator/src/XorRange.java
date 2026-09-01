public class XorRange {

    public static void main(String[] args){

        System.out.println(xorRange(3,6));
    }

    static int xorRange(int start, int end){
        return xor(end) ^ xor(start - 1);
    }

    static int xor(int n){

        switch(n % 4){

            case 0:
                return n;

            case 1:
                return 1;

            case 2:
                return n + 1;

            default:
                return 0;
        }
    }
}
