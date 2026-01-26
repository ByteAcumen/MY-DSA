public class SetZeroes {

    public void setZeroes(int[][] matrix) {
        // int m = matrix.length;
        // int n = matrix[0].length;
        // for(int i = 0; i < n ; i++){
        // for(int j = 0; j < m ;j++){
        // if(matrix[i][j] == 0){
        // for(int col = 0;col < n;col++){
        // if(matrix[i][col] != 0){
        // matrix[i][col] = -1;
        // }
        // }
        // for(int row = 0 ; row < m ; row++){
        // if(matrix[row][j] != 0){
        // matrix[row][j] = -1;
        // }
        // }
        // }
        // }
        // }
        // for(int i = 0;i < n; i++){
        // for(int j = 0;j < m; j++){
        // if(matrix[i][j] == -1){
        // matrix[i][j] = 0;
        // }
        // }
        // }

        // int n = matrix.length;
        // int m = matrix[0].length;
        // boolean[] row = new boolean[n];
        // boolean[] col = new boolean[m];
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // if (matrix[i][j] == 0) {
        // row[i] = true;
        // col[j] = true;
        // }
        // }
        // }
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // if (row[i] || col[j]) {
        // matrix[i][j] = 0;
        // }
        // }
        // }
        int n = matrix.length;
        int m = matrix[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        for (int i = 0; i < n; i++) {
            if (matrix[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        for (int j = 0; j < m; j++) {
            if (matrix[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (firstRowZero) {
            for (int j = 0; j < m; j++)
                matrix[0][j] = 0;
        }
        if (firstColZero) {
            for (int i = 0; i < n; i++)
                matrix[i][0] = 0;
        }
    }

    public static void main(String[] args) {
        int[][] matrix = {
                { 1, 1, 1 },
                { 1, 0, 1 },
                { 1, 1, 1 }
        };

        SetZeroes obj = new SetZeroes();
        obj.setZeroes(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
