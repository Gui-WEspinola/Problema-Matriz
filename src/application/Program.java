package application;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][] matrix = new int[m][n];


        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int findX = scanner.nextInt();

        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                if (matrix[i][j] == findX){
                    System.out.printf("Position %d,%d:%n", i, j);
                    if (j > 0)
                        System.out.println("Left: " + matrix[i][j-1]);
                    if (j + 1 < matrix[i].length)
                        System.out.println("Right: " + matrix[i][j+1]);
                    if (i > 0)
                        System.out.println("Up :" + matrix[i-1][j]);
                    if (i + 1 < matrix.length)
                        System.out.println("Down: " + matrix[i+1][j]);
                }
            }
        }
        scanner.close();
    }
}
