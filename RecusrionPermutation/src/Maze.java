public class Maze {
    public static void main(String[] args){
        System.out.println(mazecountstep(3,3));

    }

    static int mazecountstep(int r, int c){

        if(r == 1 || c == 1){
            return 1;
        }

        int left = mazecountstep(r-1,c);
        int right = mazecountstep(r,c - 1);


        return left + right;
    }

}
