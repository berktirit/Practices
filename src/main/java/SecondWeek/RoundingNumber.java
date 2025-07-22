package SecondWeek;

import java.util.Scanner;

public class RoundingNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yuvarlamak istediğiniz sayıyı giriniz: ");
        double userNumber = input.nextDouble();

        // Math class'ı kullanarak sayılar yuvarlanır.
        long roundedDown = (long) Math.floor(userNumber);  // En yakın alt tam sayı
        long roundedUp = (long) Math.ceil(userNumber);     // En yakın üst tam sayı
        long roundedClosest = Math.round(userNumber);      // En yakın tam sayı (0,5 ve üzeri yukarı, altı aşağı)

        System.out.println("Aşağı Yuvarlama: " + roundedDown);
        System.out.println("Yukarı Yuvarlama: " + roundedUp);
        System.out.println("En Yakın Tam Sayı: " + roundedClosest);
    }
}