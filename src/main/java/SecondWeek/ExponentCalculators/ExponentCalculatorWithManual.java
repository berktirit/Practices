package SecondWeek.ExponentCalculators;

import java.util.Scanner;

public class ExponentCalculatorWithManual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayıyı giriniz: ");
        int base = input.nextInt();

        System.out.print("Kuvvet sayısını giriniz: ");
        int power = input.nextInt();

        // Üs hesaplaması yapılmak üzere metoda gönderilir
        double result = printExponentResult(base, power);

        System.out.println(base + " üzeri " + power + " = " + result);
    }

    // Recursive metotla üs hesaplama
    public static double printExponentResult(int base, int power) {

        if (power == 0) {
            return 1; // 0'ıncı kuvvet 1'dir
        } else if (power > 0) {
            return base * printExponentResult(base, power - 1); // pozitif kuvvette hesaplama
        } else {
            return 1.0 / printExponentResult(base, -power); // negatif kuvvette hesaplama
        }
    }
}