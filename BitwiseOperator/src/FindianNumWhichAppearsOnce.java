public class FindianNumWhichAppearsOnce {
    public static void main(String[]  args){

        int[] arr = {2,3,4,1,1,2,3,6,4};

        int ans = findonceappearnum(arr);

        System.out.println(ans);
    }

    static int findonceappearnum(int[] arr){

        int unique = 0;
        for(int nums : arr){

            unique = unique ^ nums;
        }

        return unique;
    }
}
