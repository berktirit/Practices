package ThirdWeek;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LetterFrequencyCounter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kelimenizi giriniz: ");

        String words = input.nextLine().toLowerCase(); // toLowerCase() kullanımı ile büyük harfler küçük harflere çevirilir

        // Imput girdisinde sadece harf kullanma zorunluluğu
        if (!words.matches("[a-zA-ZğüşöçıİĞÜŞÖÇ]+")) {
            System.out.println("Sadece harflerden oluşan bir kelime giriniz!");
            return;
        }

        // LinkedHashMap kullanımı
        Map<Character, Integer> letterFrequency = new LinkedHashMap<Character, Integer>();

        // Harflerin frekansını map içinde sayar
        for (char letter : words.toCharArray()) {
            if (Character.isLetter(letter)) {

                /*
                    letterFrequency.getOrDefault(letter, 0), map içinde letter'ın mevcut sayısını getirir, ilk kez karşılaşılıyorsa 0 döner.
                    +1 ekleme sebebi, mevcut sayıya +1 ekler, çünkü bu harf tekrar görüldü.
                    letterFrequency.put(), yeni değeri map'e kaydeder.
                 */
                letterFrequency.put(letter, letterFrequency.getOrDefault(letter, 0) + 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        input.close();
    }
}
