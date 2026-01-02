package com.assignment1;

class MatrixOperations {

    static void printMatrix(int[][] m) {
        for (int[] row : m) {
            for (int x : row)
                System.out.print(x + " ");
            System.out.println();
        }
    }

    static int[][] add(int[][] a, int[][] b) {
        int[][] c = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                c[i][j] = a[i][j] + b[i][j];
        return c;
    }

    static int[][] transpose(int[][] a) {
        int[][] t = new int[a[0].length][a.length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                t[j][i] = a[i][j];
        return t;
    }

    static boolean isIdentity(int[][] a) {
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a.length; j++)
                if ((i == j && a[i][j] != 1) || (i != j && a[i][j] != 0))
                    return false;
        return true;
    }

    public static void main(String[] args) {

        int[][] a = {{1, 0}, {0, 1}};
        int[][] b = {{2, 3}, {4, 5}};

        System.out.println("Addition:");
        printMatrix(add(a, b));

        System.out.println("Transpose:");
        printMatrix(transpose(b));

        System.out.println("Is Identity Matrix: " + isIdentity(a));
    }
}
