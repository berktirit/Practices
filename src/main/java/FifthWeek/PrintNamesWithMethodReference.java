package FifthWeek;

import java.util.List;

public class PrintNamesWithMethodReference {
    public static void main(String[] args) {
        // Sabit (değiştirilemez) bir isim listesi oluşturuluyor
        List<String> names = List.of("Ahmet", "Ayşe", "Mehmet", "Zeynep");

        // Listenin her bir elemanını ekrana yazdırmak için method reference kullanılıyor
        names.forEach(System.out::println);
    }
}
