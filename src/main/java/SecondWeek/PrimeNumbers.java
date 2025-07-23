package SecondWeek;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int number = input.nextInt();

        // isPrime fonksiyonu, bir sayının asal olup olmadığını kontrol eder.
        if (isPrime(number)) {
            System.out.println(number + " sayısı ASALDIR !");
        } else {
            System.out.println(number + " sayısı ASAL değildir !");
        }
    }

    public static boolean isPrime(int number) {
        if (number < 2) {
            // 2'den küçük sayılar asal değildir.
            return false;
        }

        // 2'den başlayarak n'in kareköküne kadar olan sayılara bölünür.
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}