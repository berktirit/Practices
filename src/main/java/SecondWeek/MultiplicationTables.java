package SecondWeek;

import java.util.Scanner;

public class MultiplicationTables {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Üst sınırı giriniz (1 - 10): ");
        int number = input.nextInt();

        // Kullanıcıdan, 1 ve 10 dahil, o aralık harici bir input girildiğinde ekranda gösterilen hata mesajı
        if (number < 1 || number > 10) {
            System.out.println("Geçersiz bir sayı girdiniz!");
            return;
        }

        printMultiplicationTable(number); // Çarpım tablosunu ekrana basan metodun çağırılması
    }

    // Çarpım tablosunu yazdıran metot
    public static void printMultiplicationTable(int limit) {

        // Satırları kontrol eden dış döngü (1'den n'e kadar)
        for (int i = 1; i <= limit; i++) {

            // Her satırdaki sütunları kontrol eden iç döngü (1'den n'e kadar)
            for (int j = 1; j <= limit; j++) {

                System.out.printf("%2d ", i * j); // hizalı yazdırma
            }
            System.out.println();
        }
    }
}
