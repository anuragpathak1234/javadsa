public class LinearSearchINRange {
    public static void main(String[] args){

        int[] arr = new int[]{18,12,-7,3,14,28};

//        int startt = 1;
//        int  end = 4;

        int target = 3;

        System.out.println(Search(arr , target));

    }

    static int Search(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        int start = 1;
        int end = 4;

        for(int i = start; i < end; i++){
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
