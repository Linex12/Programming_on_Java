package Practice18;

import Practice18.Task4.Calculator;
import Practice18.Task4.MinMax;
import Practice18.Task5.Matrix;

public class Test {
    public static void main(String[] args) {
        Integer[] integers = new Integer[10];
        integers[0] = 44; integers[1] = 24; integers[2] = 38; integers[3] = 108; integers[4] = 78;
        integers[5] = 27; integers[6] = 120; integers[7] = 41; integers[8] = 110; integers[9] = 19;
        Double od = 43.2;
        MinMax<Integer> minmax = new MinMax<>(integers);
        System.out.println(minmax.min());
        System.out.println(minmax.max());
        System.out.println(Calculator.multiply(87.1,22.2));
        Number[][] matrix01 = new Integer[2][2];
        Number[][] matrix02 = new Double[2][2];
        Number[][] matrix0r = new Double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix01[i][j] = integers[i*2+j];
                //matrix02[i][j] = integers[4 + i*2+j];
                matrix02[i][j] = od;
                matrix0r[i][j] = 0.0;
            }
        }
        Matrix matrix1 = new Matrix(matrix01);
        Matrix matrix2 = new Matrix(matrix02);
        Matrix matrixr = new Matrix(matrix0r);
        matrix1.subtraction(matrix2,matrixr);
        System.out.println(matrix1);
        System.out.println(matrix2);
        System.out.println(matrixr);
        System.out.println(matrixr.det());
    }
}