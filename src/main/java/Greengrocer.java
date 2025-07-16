import java.util.Scanner;

public class Greengrocer {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double pearPrice = 2.14;
        double applePrice = 3.67;
        double tomatoPrice = 1.11;
        double bananaPrice = 0.95;
        double eggplantPrice = 5;

        System.out.print("Armut Kaç Kilo? : ");
        double pearKg = input.nextDouble();

        System.out.print("Elma Kaç Kilo? : ");
        double appleKg = input.nextDouble();

        System.out.print("Domates Kaç Kilo? : ");
        double tomatoKg = input.nextDouble();

        System.out.print("Muz Kaç Kilo? : ");
        double bananaKg = input.nextDouble();

        System.out.print("Patlıcan Kaç Kilo? : ");
        double eggplantKg = input.nextDouble();

        double totalPrice = (pearPrice * pearKg) +
                            (applePrice * appleKg) +
                            (tomatoPrice * tomatoKg) +
                            (bananaPrice * bananaKg) +
                            (eggplantPrice * eggplantKg);

        System.out.println("Toplam Tutar: " + totalPrice + " TL");
    }
}
