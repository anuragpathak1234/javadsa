public class SearchinRotatedByPivot {
    public static void main(String[]   args){

        int[] arr = {5,6,7,0,1,2,3,4};

        int target = 2;

        int ans = search(arr,target);
        System.out.println(ans);
    }

    static int search(int[] arr, int target){
        int pivot = findpivot(arr);

        // array is not roated
        if(pivot == -1){
            return binarysearch(arr,target,0,arr.length - 1);
        }

        // pivot is target
        if(arr[pivot] == target){
            return pivot;
        }

        // search on left side
        if(target >= arr[0]){
            return binarysearch(arr,target,0,pivot - 1);
        }

        // search rightside
        return binarysearch(arr,target,pivot + 1, arr.length - 1);
    }

    static int findpivot(int[] arr){
        int start  = 0;
        int end  = arr.length - 1;

        while(start <= end){

            int mid  = start + (end - start) / 2;

            if(end > mid  && arr[mid] > arr[mid + 1]){
                return mid;
            }

            if(mid > start && arr[mid - 1] > arr[mid]){
                return mid   - 1;
            }

            if(arr[mid] <= arr[start]){
                end =   mid   - 1;
            }

            else{
                start = mid   + 1;
            }
        }
        return -1;
    }

    static int binarysearch(int[] arr, int target, int start, int end){

        while(start <= end){

            int mid  = start +  (end - start) / 2;

            if(target == arr[mid]){
                return mid;
            }

            if(target < arr[mid]){
                end = mid - 1;
            }

            else{
                start = mid + 1;
            }
        }
        return -1;
    }
}
