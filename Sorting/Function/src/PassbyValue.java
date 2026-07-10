public class PassbyValue {
    public static void main(String[] args){
        String name = "Chhotu Pathak";
        change(name);
        System.out.println(name);
    }

    static String change(String naam){
        naam = "Anurag Pathak";
        return naam;
    }
}
