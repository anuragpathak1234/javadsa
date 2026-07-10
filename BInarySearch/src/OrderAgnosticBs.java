public class OrderAgnosticBs {
    public static void main(String[] args){
//    int[] arr = {-21,-20,-19,10,20,30,40,50,60,70};

//    int target = 70;



    int[] arr = {70,60,50,40,30,20,10,-19,-20,-21};

        int target = 70;

        int ans = BinarySearch(arr,target);
        System.out.println(ans);


    }

    static int BinarySearch(int[] arr, int target){
        int start =  0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid  = start + (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                }

                else{
                    start = mid + 1;
                }
            }

            else{
                if(target < arr[mid]){
                    start = mid + 1;
                }

                else{
                    end = mid - 1;
                }
            }
        }

        return -1;
    }
}
