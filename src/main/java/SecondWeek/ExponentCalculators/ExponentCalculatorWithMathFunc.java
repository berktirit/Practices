package SecondWeek.ExponentCalculators;

import java.util.Scanner;

public class ExponentCalculatorWithMathFunc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayıyı giriniz: ");
        int base = input.nextInt();

        System.out.print("Kuvvet sayısını giriniz: ");
        int power = input.nextInt();

        /* Math.pow() metodu, hem pozitif hem de negatif taban ve üs değerleriyle çalışabilir.
           Negatif üs kullanıldığında sonuç genellikle ondalıklı olacağından,
           dönüş tipi double olarak tanımlanır.
           Bu sayede 2^-3 gibi işlemlerde doğru sonuç (0.125) elde edilir.
        */
        double result = Math.pow(base, power);

        System.out.println(base + " üzeri " + power + " = " + result);
    }
}