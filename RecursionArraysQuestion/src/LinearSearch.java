import java.util.ArrayList;




public class LinearSearch {

    public static void main(String[] args){

        int[] arr = {2,3,1,4,4,5};
        int target = 4;

//        System.out.println(find(arr,target,0));
//
//        System.out.println(findindex(arr,target,0));
//
//        System.out.println(findlastindex(arr,target,arr.length-1));

//        findallindex(arr,target,0);
//        System.out.println(list);
//
//        System.out.println(findallindex(arr,target,0,new ArrayList<>()));

        System.out.println(findallindex2(arr,target,0));

    }

//    static boolean find(int[] arr, int target, int index){
//
//        if(index  == arr.length){
//            return false;
//        }
//
//        return arr[index] == target || find(arr,target,index + 1);
//    }
//
//    static int findindex(int[] arr, int target, int index){
//
//        if(index == arr.length){
//            return -1;
//        }
//
//        if(arr[index] == target){
//            return index;
//        }
//
//        else{
//            return findindex(arr,target,index  + 1);
//        }
//    }
//
//    static int findlastindex(int[] arr,int target, int index){
//        if(index == -1 ){
//            return -1;
//        }
//
//        if(arr[index] == target){
//            return index;
//        }
//
//        else{
//            return findlastindex(arr,target,index - 1);
//        }
//    }

//    static ArrayList<Integer> list = new ArrayList<>();
//    static void findallindex(int[] arr,int target, int index){
//
//        if(index == arr.length){
//            return;
//        }
//
//        if(arr[index] == target){
//            list.add(index);
//        }
//
//         findallindex(arr,target,index + 1);
//    }


//    static ArrayList<Integer> findallindex(int[] arr, int target, int index, ArrayList<Integer> list){
//
//        if(index  == arr.length){
//            return list;
//        }
//
//        if(arr[index] == target){
//            list.add(index);
//        }
//
//        return  findallindex(arr,target,index  + 1,list);
//    }

    static ArrayList<Integer> findallindex2(int[] arr, int target, int index){

        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){

            System.out.println(
                    "BASE CASE at index " + index +
                            " → returning []"
            );


            return list;
        }


        //This will Contain the answer of That function call only
        if(arr[index] == target){
            list.add(index);

            System.out.println(
                    "Found target at index " + index +
                            " → current local list = " + list
            );
        }

        System.out.println(
                "index " + index +
                        " is calling index " + (index + 1)
        );

         ArrayList<Integer> ansFromBelowCalls = findallindex2(arr,target,index + 1);

        System.out.println(
                "BACK at index " + index +
                        " ← received " + ansFromBelowCalls
        );


        list.addAll(ansFromBelowCalls);

        System.out.println(
                "RETURN from index " + index +
                        " → " + list
        );


        return list;
    }
}
