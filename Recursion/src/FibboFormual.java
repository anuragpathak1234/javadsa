public class FibboFormual {

    public static void main(String[] args){

        for(int i = 0; i < 11; i++){
            System.out.println(fibbonaciformula(i));
        }




    }

    static int fibbonaciformula(int n){

        return (int) (Math.pow(((1  + Math.sqrt(5)) / 2), n) / Math.sqrt(5));

    }
}
