package Lab4_1.Matrix;

import java.util.Scanner;

public class Matrix {
    private double[][] matrix;
    private int colum;
    private int row;

    //////////////////////////////////
    public Matrix(int colum, int row) {
        this.colum = colum;
        this.row = row;
        this.matrix = new double[row][colum];
        for (int i = 0; i < row; i++)
            for (int j = 0; j < colum; j++)
                this.matrix[i][j] = 0;
    }

    public Matrix(double[][] matrix, int colum, int row) {
        this.matrix = new double[row][colum];
        this.colum = colum;
        this.row = row;
        for (int i = 0; i < row; i++)
            for (int j = 0; j < colum; j++)
                this.matrix[i][j] = matrix[i][j];
    }
    //////////////////////////////////

    public void add(Matrix m) {
        if (m.row != this.row || m.colum != this.colum) {
            System.out.print("Failed! Incompatible dimensions.\n");
            return;
        }
        for (int i = 0; i < row; i++)
            for (int j = 0; j < colum; j++)
                this.matrix[i][j] += m.matrix[i][j];
    }

    public void multiplication(double x) {
        for (int i = 0; i < row; i++)
            for (int j = 0; j < colum; j++)
                this.matrix[i][j] *= x;
    }

    public void print() {
        for (double[] row : matrix)
        {
            for (double elem : row)
                System.out.printf("%-10.3f", elem);
            System.out.print('\n');
        }
    }

    @Override
    public String toString() {
        return "Matrix{" +
                "colum=" + colum +
                ", row=" + row +
                '}';
    }

    public double get(int row, int colum) {
        return matrix[row][colum];
    }

    public void set(double value, int row, int colum) {
        matrix[row][colum] = value;
    }
}
