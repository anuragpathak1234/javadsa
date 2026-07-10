public class MaxValIN1DArr {
    public static void main(String[] args){

        int[] arr = new int[]{10,20,76,90,7};

        System.out.println(max(arr));
    }

    static int max(int[] arr){
        int maxval = arr[0];
        for(int i = 0; i < arr.length;i++){
            if(arr[i] > maxval){
                maxval = arr[i];
            }
        }

        return maxval;
    }
}
