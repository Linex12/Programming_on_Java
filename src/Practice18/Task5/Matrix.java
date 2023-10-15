package Practice18.Task5;

import Practice18.Task4.Calculator;

public class Matrix<N extends Number> {
    private N[][] nMatrix;
    private int lengthy;
    private int lengthx;
    public Matrix(N[][] nMatrix) {
        this.nMatrix = nMatrix;
        lengthy = nMatrix.length;
        if (lengthy > 0)
            lengthx = nMatrix[0].length;
    }
    public void sum(Matrix matrix0, Matrix matrixr) {
        for (int i = 0; i < nMatrix.length; i++) {
            for (int j = 0; j < nMatrix[i].length; j++) {
                matrixr.nMatrix[i][j] = Calculator.sum(matrix0.nMatrix[i][j], nMatrix[i][j]);
            }
        }
    }
    public void subtraction(Matrix matrix0, Matrix matrixr) {
        for (int i = 0; i < nMatrix.length; i++) {
            for (int j = 0; j < nMatrix[i].length; j++) {
                matrixr.nMatrix[i][j] = Calculator.subtraction(nMatrix[i][j], matrix0.nMatrix[i][j]);
            }
        }
    }
    public N det() {
        return Calculator.subtraction(Calculator.multiply(nMatrix[0][0],nMatrix[1][1]),
                Calculator.multiply(nMatrix[0][1],nMatrix[1][0]));
    }

    @Override
    public String toString() {
        String result = "";
        for (int i = 0; i < nMatrix.length; i++) {
            for (int j = 0; j < nMatrix[i].length; j++) {
                result += nMatrix[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }
}
