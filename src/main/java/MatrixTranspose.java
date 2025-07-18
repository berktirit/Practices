import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Satır sayısını giriniz: ");
        int row = input.nextInt();
        System.out.print("Sütun sayısını giriniz: ");
        int column = input.nextInt();

        // row x column boyutunda bir 2 boyutlu matris oluşturulur.
        int[][] matrix = new int[row][column];

        System.out.println("Matrisin elemanlarını giriniz: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Matris[" + i + "][" + j + "] = ");
                matrix[i][j] = input.nextInt();
            }
        }

        // Transpoz matris için sütun ve satır yer değiştirerek yeni matris oluşturulur.
        int[][] matrixTranspose = new int[column][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                // Transpoz işlemi: satır ve sütun yer değiştirir.
                matrixTranspose[j][i] = matrix[i][j];

            }
        }

        // (\n) alt satıra geçmek için kullanılır.
        System.out.println("\nMatris : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                // Hizalama için tab (\t) kullanılır.
                System.out.print(matrix[i][j] + "\t");

            }
            System.out.println();
        }

        System.out.println("\nTranspose : ");
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(matrixTranspose[i][j] + "\t");
            }
            System.out.println();
        }

        input.close();
    }
}