public class StringArgument {
    public static void main(String[] args){
        String ans  = sum("Anurag","Pathak");
        System.out.println(ans);
    }

    static String sum(String firstname, String lastname){
        String finalname = firstname +  lastname;
        return finalname;
    }
}
