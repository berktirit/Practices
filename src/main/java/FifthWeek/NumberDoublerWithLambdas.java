package FifthWeek;

import java.util.ArrayList;
import java.util.List;

public class NumberDoublerWithLambdas {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Sayıları iki katına çıkarma ve yazdırma - Lambda & Stream
        numbers.replaceAll(n -> n * 2);  // listenin elemanlarını güncelle
        numbers.forEach(System.out::println); // her elemanı yazdır
    }
}
