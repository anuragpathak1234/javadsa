public class FlippingAndInvertingImage {

    public static void main(String[] args){

        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        int[][] ans = flippingImage(image);

        for(int[] rows : image){
            for(int num : rows){
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }

    static int[][] flippingImage(int[][] image){



        for(int[] rows : image ){


            int first = 0;
            int last = rows.length - 1;


            while(first <= last){

                int temp  = rows[first] ^ 1;
                rows[first] = rows[last] ^ 1;

                rows[last] = temp;


                first++;
                last--;
            }

        }
        return image;
    }
}
