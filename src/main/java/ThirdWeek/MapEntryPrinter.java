package ThirdWeek;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class MapEntryPrinter {
    public static void main(String[] args) {
        // LinkedHashMap ile veriler eklenme sırasına göre saklanır ve o sırayla yazdırılır
        Map<String, Integer> scores = new LinkedHashMap<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Öğrencinin adını girin: ");
            String name = input.nextLine();

            System.out.print("Öğrencinin notunu girin: ");
            int score = input.nextInt();
            input.nextLine();

            scores.put(name, score);

            // 5'ten az giriş varsa 5 olana kadar devam edilir
            if (scores.size() < 5) {
                System.out.println("En az 5 öğrenci girilmelidir. Şu anki giriş sayısı: " + scores.size());
                continue;
            }

            // 5 veya daha fazla giriş varsa kullanıcıya devam edip etmediği sorulur
            System.out.print("Sonuç listesini görmek ister misiniz? (evet/hayır): ");
            // Kullanıcı yanlışlıkla " EVeT   " gibi bir girdi girerse onu düzeltir
            String answer = input.nextLine().trim().toLowerCase();

            // Kullanıcı 5. girdi sonrası sonuç listesini görmek isterse
            if (answer.equals("evet")) {
                System.out.println("\nÖğrenci Not Listesi:");
                for (Map.Entry<String, Integer> entry : scores.entrySet()) {
                    System.out.println(entry.getKey() + " = " + entry.getValue());
                }
                break;
            } else if (answer.equals("hayır")) { // Kullanıcı 5'ten fazla girdi yapmak isterse
                System.out.println("Yeni giriş yapmaya devam ediliyor...");
            } else { // "evet" veya "hayır" harici bir girdi girilirse
                System.out.println("Geçersiz cevap. Yeni giriş yapmaya devam ediliyor...");
            }
        }
        input.close();
    }
}