import java.util.Random;

public class FunWith2DArrays {
    public static void main(String[] args) {
        //2 row x 3 columns
        int[][] my2DArray = new int[2][3];
        double[][] twice2DArray = new double[2][3];

        fill2DArray(my2DArray);
        print2DArray(my2DArray);
        System.out.println();
        multiply2DArray(my2DArray);
        print2DArray(my2DArray);
        System.out.println();

        fillTwice2DArray(twice2DArray);
        printTwice2DArray(twice2DArray);


    }

    public static void fill2DArray(int[][] twoDArr){
        Random rand = new Random();

        for(int i=0; i < twoDArr.length; i++){
            for(int j=0; j < twoDArr[i].length; j++){
                //randomize 0 through 99(inclusive)
                //row i, column j
                twoDArr[i][j] = rand.nextInt(100) ;
            }
        }

    }

    public static void fillTwice2DArray(double[][] twice2dArray){
        Random rand = new Random();
        for(int i=0; i < twice2dArray.length; i++){
            for (int j=0; j < twice2dArray[i].length; j++ ){
                twice2dArray[i][j] = rand.nextDouble(100);
            }
        }
    }

    public static void print2DArray(int[][] twoDArr){
        for(int[] arr : twoDArr){
            for(int num: arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void multiply2DArray(int[][] twoDArr){
        for(int i=0; i < twoDArr.length; i++){
            for (int j=0; j < twoDArr[i].length; j++){
                twoDArr[i][j] *= 2;
            }
        }
    }

    public static void printTwice2DArray(double[][] twice2dArray){
        for(double[] arr : twice2dArray){
            for(double num: arr){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
