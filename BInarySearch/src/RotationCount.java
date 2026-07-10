public class RotationCount {

    public static void main(String[]  args){

        int[] arr = {5,6,7,0,1,2,3,4};

        System.out.println(rotation(arr));
    }

   static  int rotation(int[] arr){
        int pivot = findpivot(arr);

        if(pivot == -1){
            return -1;
        }

        else{
            return pivot + 1;
        }
   }

//   static int findpivot(int[] arr){
//
//        int start = 0;
//        int end = arr.length - 1;
//
//
//        while(start <= end){
//
//            int mid  = start + (end  - start) / 2;
//            if(end > mid && arr[mid] > arr[mid + 1]){
//                return mid;
//            }
//
//            if(mid > start && arr[mid - 1] > arr[mid]){
//                return mid - 1;
//            }
//
//            if(arr[mid] < arr[start]){
//                end = mid - 1;
//            }
//            else{
//                start = mid + 1;
//            }
//        }
//        return -1;
//   }

   // SECOND METHOD OF FINDING PIVOT OF ARRAY CONSIST DUPLICATE VALUES

    static int findpivot(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){

            int mid = start + (end - start) / 2;

            if(end > mid && arr[mid] > arr[mid + 1]){
                return mid;

            }

            if(mid > start && arr[mid - 1]  >  arr[mid]){
                return mid  - 1;
            }

            if(arr[start] == arr[mid] && arr[mid] == arr[start]){

                if(end > start && arr[start] > arr[start + 1]){
                    return start;
                }
                start++;

                if(end > start && arr[end - 1] > arr[end]){
                    return end - 1;
                }
                end--;
            }

            else if(arr[start] < arr[mid] && arr[start] == arr[mid] && arr[mid] > arr[end]){
                start = mid   + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
