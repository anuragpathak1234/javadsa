import java.util.Scanner;


public class EvenDigit {
    public static void main(String[] args){

        int[] arr = new int[]{12,345,65,7890};

        int ans = FindEvenDigits(arr);
        System.out.println(ans);
    }

    static int FindEvenDigits(int[] arr){
        int count = 0;

        for(int num : arr){
            if(Even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean Even(int num){
        int digit = digits(num);

        return digit % 2 == 0;
    }

    static int digits(int num){
        int count = 0;

        while(num > 0){
            count++;
            num = num / 10;
        }

        return count;
    }


}
