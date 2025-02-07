public class MatrixMul {
    public static void main(String[] args) {
        int A[][] = {
            {3, 5, 9},
            {7, 6, 2},
            {4, 3, 5}
        };

        int B[][] = {
            {1, 5, 2},
            {6, 8, 4},
            {3, 9, 7}
        };

        int C[][] = new int[3][3]; // Result matrix

        // Matrix multiplication logic
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                C[i][j] = 0; // Initialize the cell
                for (int k = 0; k < 3; k++) {
                    C[i][j] += A[i][k] * B[k][j]; // Multiplication & addition
                }
                System.out.print(C[i][j] + " "); // Print the element
            }
            System.out.println(); // Move to next row
        }
    }
}
