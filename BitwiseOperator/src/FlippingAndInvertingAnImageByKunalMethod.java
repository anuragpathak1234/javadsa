public class FlippingAndInvertingAnImageByKunalMethod {

    public static void main(String[] args){

        int[][] image = {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

        int[][] ans = flippingAndInvertingImage(image);

        for(int[] rows   : image){
            for(int num : rows){
                System.out.print(num + " ");
            }

            System.out.println();
        }
    }

    static int[][] flippingAndInvertingImage(int[][] image){

        for(int[] rows  : image){


            //REVERSE THE ARRAY
            for(int i = 0; i  < (image[0].length + 1) / 2; i++){

                // swap

                int temp = rows[i] ^ 1;

                rows[i] = rows[image[0].length - i - 1] ^ 1;

                rows[image[0].length -i- 1] = temp;
            }
        }

        return image;
    }
}
