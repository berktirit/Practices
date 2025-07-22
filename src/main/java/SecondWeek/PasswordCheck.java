package SecondWeek;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Şifrenizi giriniz: ");
        String password = input.nextLine();

        if (password.length() == 0) {
            System.out.println("Girdiğiniz şifre boş olamaz!");
            return;
        }

        /* boolean değişkenlerle en az 8 karakter içermesi,
           Space karakteri içermemesi,
           İlk harfin büyük olması,
           Son karakterin ? olması kontrol edilir.
         */
        boolean minLength = password.length() >= 8;                                   // En az 8 karakter içermelidir.
        boolean noSpace = !password.contains(" ");                                    // Space karakteri içermemelidir.
        boolean firstUpper = Character.isUpperCase(password.charAt(0));               // İlk karakter büyük harf içermelidir.
        boolean endsWithQuestion = password.charAt(password.length() - 1) == '?';     // Son karakter ? içermelidir.

        // VE operatörüyle tüm boolean değişkenleri bağlanıp koşula sokulur.
        if (minLength && noSpace && firstUpper && endsWithQuestion) {
            System.out.println("Girdiğiniz şifre geçerlidir.");
        } else {
            System.out.println("Girdiğiniz şifre geçersizdir!!!");
        }
    }
}