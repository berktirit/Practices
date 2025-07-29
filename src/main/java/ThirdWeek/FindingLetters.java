package ThirdWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FindingLetters {
    public static void main(String[] args) {
        List<String> wordList = new ArrayList<>(Arrays.asList("Patika", "Java", "Spring", "Methods"));
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan 4 harf girişi
        for (int i = 0; i < 4; i++) {
            System.out.print((i + 1) + ". harfi giriniz: ");
            String letter = input.nextLine().toLowerCase(); // Girilen inputları küçük harfe çevirir.

            boolean found = false; // Harf herhangi bir kelimede bulundu mu, kontrolü için değişken
            for (int j = 0; j < wordList.size(); j++) {
                String word = wordList.get(j).toLowerCase(); // Karşılaştırma için listedeki kelimelerin harflerini küçük harfe çevirir.

                // Eğer kelimenin içinde girilen harf geçiyorsa "found" ile değiştirir.
                if (word.contains(letter)) {
                    wordList.set(j, "found");
                    found = true;
                }
            }

            // Input'a girilen harf hiçbir kelimede geçmiyorsa harf listeye yeni eleman olarak eklenir.
            if (!found) {
                wordList.add(letter);
            }
        }

        System.out.println("Güncellenmiş liste: " + wordList);
    }
}