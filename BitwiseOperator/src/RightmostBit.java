public class RightmostBit {

    public static void main(String[] args){

        int number = 18;

        int position = findRightMostSetBitPosition(number);

        System.out.println("Number   = " + number);

        System.out.println("Binary Represenatation = "  +Integer.toBinaryString(number));

        if(position == -1){
            System.out.println("There is No Set Bit");
        }

        else{
            System.out.println("Position Of The Right Most Set Bit = " + position);
        }
    }

    static int findRightMostSetBitPosition(int number){

        if(number == 0){
            return -1;
        }

        int position = 1;

        while((number & 1) == 0){
            number = number >> 1;
            position++;
        }
        return position;
    }
}
