package FirstWeek;

import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        // Kendisi hariç çarpanlarının toplamının tutulacağı değişken.
        int sum = 0;

        // 1'den number-1'e kadar tüm sayıları kontrol eder.
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }

        System.out.println("Girdiğiniz sayının kendisi hariç çarpanlarının toplam sonucu: " + sum);

        // Mükemmel sayı kontrolü
        if (sum == number) {
            System.out.println(sum + " bir mükemmel sayıdır.");
        } else {
            System.out.println(sum + " bir mükemmel sayı değildir.");
        }

        input.close();
    }
}