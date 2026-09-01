public class BasicStringQuestion {

    public static void main(String[] args){

        skip("","baccad");


    }

    static void skip(String store, String original){

        if(original.isEmpty()){
            System.out.println(store);

            return;
        }

        char ch = original.charAt(0);

        if(ch == 'a'){
            skip(store,original.substring(1));
        }

        else{

            skip(store + ch, original.substring(1));
        }
    }
}
