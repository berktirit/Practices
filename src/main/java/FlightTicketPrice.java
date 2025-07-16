import java.util.Scanner;

public class FlightTicketPrice {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz : ");
        int distance = input.nextInt();

        System.out.print("Yaşınızı giriniz : ");
        int age = input.nextInt();
        ;

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş Dönüş) : ");
        int type = input.nextInt();

        if (distance <= 0 || age <= 0) {
            System.out.println("Hatalı veri girdiniz!");
            return;
        }

        double unitPrice = 0.10;
        double distancePrice = distance * unitPrice;
        double discount = 0.0;

        if (age < 12) {
            discount = 0.50;
        } else if (age >= 12 && age <= 24) {
            discount = 0.10;
        } else if (age > 65) {
            discount = 0.30;
        }

        double discountedPrice = distancePrice - (distancePrice * discount);

        switch (type) {
            case 1:
                System.out.println("Toplam Tutar = " + discountedPrice + " TL");
                break;
            case 2:
                double totalPrice = ((discountedPrice - (discountedPrice * 0.20)) * 2);
                System.out.println("Toplam Tutar = " + totalPrice + " TL");
                break;
            default:
                System.out.println("Hatalı veri girdiniz!");
        }
    }
}
