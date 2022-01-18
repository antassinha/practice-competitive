import java.util.Scanner;

public class SetMatrixZero {

    public static void setZeroes(int[][] matrix) {

        int col0 = 1;
        
        for (int i=0;i<matrix.length;i++) {
            if(matrix[i][0] ==0) col0 =0;
            for (int j=1; j<matrix[0].length; j++) {
                if(matrix[i][j] == 0) {
                    matrix[i][0] = matrix[0][j] = 0;  
                } 
            }
        }

        for(int i = matrix.length-1; i>=0; i--) {
            for(int j=matrix[0].length-1; j>=1; j--) {
                if(matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
            if(col0 == 0) matrix[i][0] = 0;
        }

        System.out.print("[");
        for (int i=0;i<matrix.length;i++) {
            System.out.print("[");
            for (int j=0; j<matrix[0].length; j++) {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.print("]");
            
        }
        
        System.out.println("]");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int[][]matrix = new int[m][n];

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        setZeroes(matrix);

        scanner.close();

    }
    
}
