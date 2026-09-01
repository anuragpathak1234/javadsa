public class PassingNumbers {

    public static void main(String[] args){

        fun(5);
    }
    static void fun(int n){

        if(n == 0){
            return ;
        }

        System.out.println(n);
        //fun(n--)// IT will not subtarct n only passing in function so we will get 5 indefinte times ;

        fun(--n); // it will first subtract the n and then pass it to function so we can get answer like
        // 5 4 3 2 1;
    }
}
