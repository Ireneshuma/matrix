public class matrixx {
    public static void main(String[] args) {

        int[][] matrixx = new int[10][10];
        int i, j;

        for (i = 0; i < matrixx.length; i++) {
            for (j = 0; j < matrixx.length; j++) {
                if (i == j) {
                    matrixx[i][j] = i;
                } else {
                    matrixx[i][j] = 0;
                    System.out.println(matrixx[i][j] + " ");
                }

                int sum = 0;
                sum += matrixx[i][j];
                System.out.println();
                System.out.println("The sum of the diagonal " + sum);


            }

        }
    }
}

