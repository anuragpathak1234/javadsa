import java.util.Arrays;
public class SearchIn2D {
    public static void main(String[] args){

        int[][] arr = {
                {10,20,30,40},
                {15,25,35,45},
                {28,29,37,49},
                {33,34,38,50}
        };

        int target = 37;



        System.out.println(Arrays.toString(SearchIn2D(arr,target)));
    }

    static int[] SearchIn2D(int[][] arr, int target){

        int rows = 0;
        int col = arr.length - 1;

        while(rows < arr.length && col >= 0){
            if(arr[rows][col] == target){
                return new int[]{rows,col};
            }

            if(arr[rows][col] < target){
                rows++;
            }

            else{
                col--;
            }
        }
        return new int[] {-1,-1};
    }
}
