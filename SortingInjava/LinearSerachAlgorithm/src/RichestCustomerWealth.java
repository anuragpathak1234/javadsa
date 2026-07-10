import java.util.Scanner;
import java.util.Arrays;

public class RichestCustomerWealth {
    public static void main(String[] args){

        Scanner input  = new Scanner(System.in);

        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {1,6,2}
        };

        int ans = maximumWealth(arr);
        System.out.println(ans);
    }

    static int maximumWealth(int[][] arr){
        int maxWealth = 0;
        for(int i = 0; i < arr.length;i++){
            int sum = 0;
            for(int j = 0; j < arr[i].length;j++){
                sum += arr[i][j];
                if(sum > maxWealth){
                    maxWealth = sum;
                }
            }
        }

        return maxWealth;
    }
}
