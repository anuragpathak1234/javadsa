public class OneToN {
    public static void main(String[] args){

        OneToN(1);
    }

    static void OneToN(int n){
        if(n > 5){
            return;
        }

        System.out.println(n);
        OneToN(n+1);
    }
}
