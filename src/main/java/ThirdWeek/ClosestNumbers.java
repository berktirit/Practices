package ThirdWeek;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ClosestNumbers {
    public static void main(String[] args) {

        // Arrays.asList(...) ifadesi ile sabit sayı listesi oluşturuluyor, ardından bu liste ArrayList'e dönüştürülüyor.
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(5, 17, 55, 28, 46, 99, 31, 74, 83, 62));

        // Liste küçükten büyüğe sıralanıyor. Bu sıralama, en yakın iki sayıyı bulmak için gereklidir.
        Collections.sort(numberList);

        // Başlangıçta en büyük tam sayı değeri atanıyor ki ilk karşılaştırmada değişebilsin.
        int minDifference = Integer.MAX_VALUE;

        // En yakın iki sayıyı tutacak iki değişken.
        int number1 = 0, number2 = 0;

        // ArrayList’te son indeks size - 1'dir.
        for (int i = 0; i < numberList.size() - 1; i++) {

            // Math.abs, negatif sonuçları pozitif hale getirir.
            int difference = Math.abs(numberList.get(i) - numberList.get(i + 1));

            // Fark şu ana kadarki en küçük fark ise;
            if (difference < minDifference) {
                minDifference = difference;
                number1 = numberList.get(i);
                number2 = numberList.get(i + 1);
            }
        }

        System.out.println("Listenin en yakın iki sayısı: " + number1 + " & " + number2 + " ||| İki sayının arasındaki fark: " + number2 + " - " + number1 + " = " + minDifference);
    }
}