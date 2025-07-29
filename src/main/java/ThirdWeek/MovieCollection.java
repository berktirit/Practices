package ThirdWeek;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.*;

public class MovieCollection {

    /*
        Lombok kullanarak Film class'ında
        getter, constructor ve toString() yazmadan
        50 satır yerine 5 satır ile aynı iş yapılırç
     */
    @Getter
    @ToString
    @AllArgsConstructor
    static class Film {
        private String filmName;
        private int filmYear;
        private String filmGenre;
        private double filmRating;
    }

    public static void main(String[] args) {

        // ArrayList'e eklenen 5 film, ayrıca Arrays.asList() kullanımıyla daha hızlı veri tanımı ve daha kısa kod elde edilir.
        List<Film> filmList = new ArrayList<>(Arrays.asList(
                new Film("Inception", 2010, "Bilim Kurgu", 8.8),
                new Film("The Godfather", 1972, "Suç", 9.2),
                new Film("Interstellar", 2014, "Bilim Kurgu", 8.6),
                new Film("Pulp Fiction", 1994, "Suç", 8.9),
                new Film("The Dark Knight", 2008, "Aksiyon", 9.0)
        ));

        /*
            \n kullanımı ile output,
            daha okunaklı hale getirilir.
         */
        System.out.println("\n***** IMDB Puanına Göre En İyi Filmler Sıralaması *****\n");
        sortByIMDB(new ArrayList<>(filmList)); // IMDB puanına göre sıralama yapan metot oluşturma

        System.out.println("\n\n***** Yayın Yılına Göre En Eskiden En Yeniye Film Sıralaması *****\n");
        sortByYear(new ArrayList<>(filmList)); // Yıla göre sıralama yapan metot oluşturma

        System.out.println("\n\n***** Bilim Kurgu Filmleri *****\n");
        filterByGenre(filmList, "Bilim Kurgu"); // Türe göre sıralama yapan metot oluşturma
    }

    // IMDB puanına göre sıralama yapan metot
    private static void sortByIMDB(List<Film> films) {

        // films listesini, filmlerin IMDb puanlarına göre büyükten küçüğe doğru sıralar.
        Collections.sort(films, (f1, f2) -> Double.compare(f2.getFilmRating(), f1.getFilmRating()));
        for (Film film : films) {

            // Output'u daha okunaklı hale getirme
            System.out.println("Film Adı = " + film.getFilmName()
                    + "  -  Film Yılı = " + film.getFilmYear()
                    + "  -  Film Türü = " + film.getFilmGenre()
                    + "  -  IMDB Puanı = " + film.getFilmRating());
        }
    }

    // Yıla göre eskiden yeniye sıralama yapan metot
    private static void sortByYear(List<Film> films) {

        // films listesini, filmlerin yılına göre eskiden yeniye doğru sıralar.
        Collections.sort(films, Comparator.comparingInt(Film::getFilmYear));
        for (Film film : films) {

            // Output'u daha okunaklı hale getirme
            System.out.println("Film Adı = " + film.getFilmName()
                    + "  -  Film Yılı = " + film.getFilmYear()
                    + "  -  Film Türü = " + film.getFilmGenre()
                    + "  -  IMDB Puanı = " + film.getFilmRating());
        }
    }

    // Türe göre (Bilim Kurgu) sıralama yapan metot
    private static void filterByGenre(List<Film> films, String genre) {
        boolean found = false; // Filtrelenen türe ait film bulunup bulunmadığını kontrol etmek için
        for (Film film : films) {

            // Film türü, parametre olarak verilen türe büyük/küçük harf duyarsız şekilde eşitse
            if (film.getFilmGenre().equalsIgnoreCase(genre)) {

                // Output'u daha okunaklı hale getirme
                System.out.println("Film Adı = " + film.getFilmName()
                        + "  -  Film Çıkış Yılı = " + film.getFilmYear()
                        + "  -  Film Türü = " + film.getFilmGenre()
                        + "  -  IMDB Puanı = " + film.getFilmRating());
                found = true; // En az bir film bulunduğunu işaretle
            }
        }

        // Eğer döngü sonunda belirtilen türe ait hiç film bulunamadıysa
        if (!found) {
            System.out.println("Bu türe ait film bulunamadı.");
        }
    }
}