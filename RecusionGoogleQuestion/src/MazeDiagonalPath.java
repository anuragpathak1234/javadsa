public class MazeDiagonalPath {

    public static void main(String[] args){
        DiagonalMazePath("",3,3);

    }

    static void DiagonalMazePath(String p, int r, int c){

        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r > 1 && c > 1){
            DiagonalMazePath(p + 'D',r-1,c- 1);
        }

        if(r   > 1){
            DiagonalMazePath(p + 'V',r - 1, c);
        }

        if(c > 1){
            DiagonalMazePath(p + 'H',r, c-1);
        }
    }
}
