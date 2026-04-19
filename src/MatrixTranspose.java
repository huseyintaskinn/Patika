public class MatrixTranspose {
    public static void main(String[] args) {
        // Örnek matris 1 (2x3)
        int[][] matrix1 = {
                {2, 3, 4},
                {5, 6, 4}
        };

        // Örnek matris 2 (2x3)
        int[][] matrix2 = {
                {1, 2, 3},
                {4, 5, 6}
        };

        // Örnek matris 3 (3x4)
        int[][] matrix3 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        System.out.println("=================================");
        System.out.println("MATRİS TRANSPOZU (DEVRİĞİ)");
        System.out.println("=================================\n");

        // Matris 1 için transpoz hesaplama
        printMatrixWithTranspose(matrix1);

        System.out.println();

        // Matris 2 için transpoz hesaplama
        printMatrixWithTranspose(matrix2);

        System.out.println();

        // Matris 3 için transpoz hesaplama
        printMatrixWithTranspose(matrix3);
    }

    // Matrisin transpozunu hesaplayan metot
    public static int[][] transpose(int[][] matrix) {
        int rows = matrix.length;      // Satır sayısı
        int cols = matrix[0].length;   // Sütun sayısı

        // Transpoz matrisi (cols x rows boyutunda)
        int[][] transposeMatrix = new int[cols][rows];

        // Transpoz işlemi: satır ve sütunlar yer değiştirir
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposeMatrix[j][i] = matrix[i][j];
            }
        }

        return transposeMatrix;
    }

    // Matrisi ekrana yazdıran metot
    public static void printMatrix(int[][] matrix, String title) {
        System.out.println(title + " : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }

    // Matris ve transpozunu birlikte yazdıran metot
    public static void printMatrixWithTranspose(int[][] matrix) {
        System.out.println("Matris : ");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }

        int[][] transposed = transpose(matrix);

        System.out.println("Transpoze : ");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + "    ");
            }
            System.out.println();
        }
    }
}