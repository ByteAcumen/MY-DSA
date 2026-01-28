public class RotateClockwise{

    public int[][] rotateClockwise(int[][] matrix){
        // int n = matrix.length;
        // int[][] rotated = new int[n][n];
        // for(int i = 0; i < n; i++){
        //     for(int j = 0; j < n; j++){
        //         rotated[j][n-1-i] = matrix[i][j];
        //     }
        // }
        // return rotated;

        int n = matrix.length;
        //transpose matric
        for(int i = 0; i < n; i++){
            for(int j = i; j < n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < n; i++){
            int left = 0, right = n -1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
        return matrix;
    }
    public static void main(String[] args) {
        int[][] mat = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        RotateClockwise obj = new RotateClockwise();
        int[][] rotated = obj.rotateClockwise(mat);

        // Print the rotated matrix
        for (int[] row : rotated) {
            for (int val : row)
                System.out.print(val + " ");
            System.out.println();
        }
    }
}