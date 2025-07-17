import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        for (int i = number; i >= 1; i--) {       // n'den 1'e kadar döngü (satır sayısı kadar dönecek)
            for (int j = 1; j <= i; j++) {        // Her satırda i kadar yıldız basılır.
                System.out.print("*");
            }
            if (i != 1) {                         // Son satırda boşluk oluşturmaz.
                System.out.println();             // Diğer yeni satıra geçilir.
            }
        }

        input.close();
    }
}