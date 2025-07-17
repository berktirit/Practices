import java.util.Scanner;

public class AverageMultiplesTwelve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int number = input.nextInt();

        int sum = 0;                                    // Hem 3'ün hem de 4'ün katları olan sayıların toplamını tutacağım değişken.
        int count = 0;                                  // Hem 3'ün hem de 4'ün katları olan kaç tane sayı olduğunu saymak için oluşturduğum değişken.

        for (int i = 0; i <= number; i++) {
            if (i % 12 == 0) {
                sum += i;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("0 ile " + number + " arasındaki hem 3'ün hem de 4'ün katları olan sayıların ortalaması: " + average);
        } else {
            System.out.println("0 ile " + number + " arasında hem 3'ün hem de 4'ün katları olan sayılar yok.");
        }

        input.close();
    }
}