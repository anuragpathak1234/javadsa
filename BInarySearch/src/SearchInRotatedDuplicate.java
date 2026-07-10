public class SearchInRotatedDuplicate {
    public static void main(String[] args){

        int[] arr = {2,5,6,0,0,1,2};

        int target = 0;

        System.out.println(search(arr,target));
    }

    static int search(int[] arr, int target){
        int pivot = findpivot(arr);

        //Array is not Roated
        if(pivot  == -1){
            return binarysearch(arr,target,0,arr.length);
        }

        if(arr[pivot] == target){
            return pivot;
        }

        if(target >= arr[0]){
            return binarysearch(arr,target,0,pivot - 1);
        }

        return binarysearch(arr,target,pivot + 1, arr.length - 1);

    }

    static int findpivot(int[] arr){

        int start  = 0;
        int end   = arr.length  - 1;

        while(start <= end){

            int mid = start + (end  - start)/ 2;

            // case 1 : we know this is ascending order binary searc so if previous elemets is greater than next elements that means ascending order have bt
//            so we are checkinh here if my mid is greter than next elements our pivot is find right here
            if(end > mid && arr[mid] > arr[mid + 1]){
                return mid;
            }


//           CASE 2 : suppose if left elements is graeter than mid that means pivot is left elements because array is in ascending order

            if(mid > start && arr[mid -1] > arr[mid] ){
                return mid - 1;
            }

            // CASE3 : SUPPOSE WE HAVE START , END , MID ALL ARE EQUAL SO IF WE COMPARE THEM WE CAN'T GET ANY INFORMATION SO WE DICIDE
            // TO REMOVE THEM BEFORE REMOVING WE ARE CHECKING IS THAT START OR END IS NOT A PIVOT MAYBE IN SOME CASE IT DOES
            if(arr[start] == arr[mid] && arr[mid] == arr[end]){

                if(end > start && arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                if(end > start && arr[end - 1] > arr[end]){
                    return end - 1;
                }
                end--;

            }

            // case 4 : LEFT SIDE IS SORTED
            else if(arr[start] < arr[mid] || arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid + 1;
            }


            else{
                end = mid - 1;
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
