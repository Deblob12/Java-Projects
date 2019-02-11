public class Determinant {
    public static double determinant(double[][] matrix) {
        if (matrix.length == 2 && matrix[0].length == 2) {
            return (matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0]);
        }
        int minorR = 0;
        int count = 0;
        double cofactor = 0.0;
        double total = 0;
        double[][] minor = new double[matrix.length - 1][matrix[minorR].length - 1];
        for (int minorC = 0; minorC < matrix[minorR].length; minorC++) {
            if ((minorR + minorC) % 2 == 0) {
                cofactor = matrix[minorR][minorC];
            }
            else {
                cofactor = -1 * matrix[minorR][minorC];
            }
            for (int i = 0; i < matrix.length; i++) {
                if (i == minorR) {
                    continue;
                }
                for (int j = 0; j < matrix[minorR].length; j++) {
                    if (j == minorC) {
                        continue;
                    }
                    minor[count / (matrix.length - 1)][count % (matrix[minorR].length - 1)] = matrix[i][j];
                    count++;
                }
            }
            count = 0;
            total += (cofactor * determinant(minor));
        }
        return total;
    }

    public static void main(String[] args) {
        double[][] a = new double[][]{
                {2,4,1,-3},
                {7,2,2,-2},
                {3,3,2,2},
                {0,5,1,0}
        };
        System.out.println(determinant(a));
    }
}
