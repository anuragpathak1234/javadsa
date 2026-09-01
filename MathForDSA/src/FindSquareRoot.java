public class FindSquareRoot {

    public static void main(String[] args){

        int n = 40;

        int p = 3;

        // Here P Stand for precisiom;

        double ans = sqrt(n,p);

        System.out.println(ans);
    }

    static double sqrt(int n, int p){

        int start = 0;
        int end = n;

        double root = 0.0;

        while(start <= end){

            int m = start + (end - start ) / 2;

            if(m * m == n){
                return m;
            }

            else if(m * m > n){
                end = m - 1;
            }

            else{
                start = m  + 1;
            }

        }

        double increament = 0.1;

        for(int i = 0;  i < p;i++){

            while(root * root <= n ){
                root += increament;
            }

            root -= increament;
            increament /= 10;
        }

        return root;
    }


}
