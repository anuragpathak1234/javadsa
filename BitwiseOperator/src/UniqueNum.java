public class UniqueNum {

    public static void main(String[] args){

        int[] arr = {2,2,3,2};

        int ans = findUniqueNum(arr);

        System.out.println(ans);
    }

    static int findUniqueNum(int[] arr){


        int ans = 0;

        for(int i = 0; i < 32; i++){

            int sum = 0;

            for(int num : arr){
                if((num & (1 << i)) != 0){
                    sum++;
                }
            }

            if( sum % 3 != 0){
                ans = ans | (1  << i);
            }
        }
        return ans;
    }
}
