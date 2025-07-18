import java.util.Scanner;

public class TypeCasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Tam sayı girmek için 1'i, ondalıklı sayı girmek için 2'yi tuşlayınız: ");

        /* "if (input.hasNextInt())" ile InputMismatchException hatası vermek yerine "hasNextInt()" ile kontrol
           edip kullanıcıya hata mesajı yollamak istiyoruz.
         */
        if (input.hasNextInt()) {

            int typeChoice = input.nextInt();

            switch (typeChoice) {

                // 1 tuşlaması sonrası tam sayı girişini alma ve ondalıklı sayıya dönüştürme
                case 1:
                    System.out.print("Ondalıklı sayıya çevirmek istediğiniz tam sayıyı giriniz: ");
                    if (input.hasNextInt()) {
                        int intValue = input.nextInt();

                        // Auto Widening
                        double result = intValue;

                        System.out.println("Ondalıklı sayıya dönüşmüş hali: " + result);
                    } else {
                        System.out.println("Hata: Lütfen geçerli bir tam sayı giriniz!");
                    }
                    break;

                // 2 tuşlaması sonrası ondalıklı sayı girişini alma ve tam sayıya dönüştürme
                case 2:
                    System.out.print("Tam sayıya çevirmek istediğiniz ondalıklı sayıyı giriniz: ");
                    if (input.hasNextDouble()) {
                        double doubleValue = input.nextDouble();

                        // Explicit Narrowing
                        int result = (int) doubleValue;

                        System.out.println("Tam sayıya dönüşmüş hali: " + result);
                    } else {
                        System.out.println("Hata: Lütfen geçerli bir ondalıklı sayı giriniz!");
                    }
                    break;

                default:
                    System.out.println("Hatalı bir seçim yaptınız. Lütfen sadece 1 veya 2 giriniz.");
            }
        } else {
            System.out.println("Hatalı bir seçim yaptınız. Lütfen sadece 1 veya 2 giriniz.");
        }
        input.close();
    }
}