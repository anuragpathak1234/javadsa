public class SearchInMountainArray {
    public static void main(String[] args){
        int[] arr = {1,3,5,7,9,11,8,6,2};
        int target = 8;

        int ans = search(arr,target);
        System.out.println(ans);

    }

    static int search(int[] arr, int target){

        int peak = peakIndex(arr);

        int firsttry = binarysearch(arr,target,0,peak,true);

        if(firsttry != -1){
            return firsttry;
        }

        return binarysearch(arr,target,peak + 1,arr.length - 1,false);

    }

    static int peakIndex(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid;
            }

            else{
                start = mid + 1;

            }
        }

        return start;
    }

    static int binarysearch(int[] arr, int target, int start, int end, boolean firsttry){

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(arr[mid] == target){
                return mid;
            }

            if (firsttry){

                if(target  < arr[mid]){
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
