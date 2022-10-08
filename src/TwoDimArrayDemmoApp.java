public class TwoDimArrayDemmoApp {

    public static void main(String[] args) {
        int[] oneDim = new int[3];
        int[][] twoDim = new int[5][3];

        twoDim[0][0] = 1;
        twoDim[0][1] = 1;
        twoDim[3][2] = 1;

        for (int i = 0; i < twoDim[0].length ; i++) {
            for (int j = 0; j < twoDim.length ; j++) {
                System.out.print(twoDim[i][j] + " | ");
            }

            System.out.println();

        }



    }
}
