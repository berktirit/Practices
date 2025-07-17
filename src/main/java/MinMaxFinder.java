import java.util.Scanner;

public class MinMaxFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int countNumber = input.nextInt();

        if (countNumber <= 1) {
            System.out.println("Geçerli bir sayı girmediniz. Hesaplama işlemi için en az 2 sayı girilmelidir.");
            input.close();
            return;
        }

        /* min değişkenini en yüksek int değeriyle başlatıyoruz.
           Böylece kullanıcıdan gelen ilk sayı mutlaka bundan küçük olacaktır. */
        int min = Integer.MAX_VALUE;
        /* max değişkenini en düşük int değeriyle başlatıyoruz.
           Böylece kullanıcıdan gelen ilk sayı mutlaka bundan büyük olacaktır. */
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= countNumber; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            int processNumber = input.nextInt();

            // Eğer girilen sayı şu anki min’den küçükse min’i güncelle.
            if (processNumber < min) min = processNumber;

            // Eğer girilen sayı şu anki max’dan büyükse max’i güncelle.
            if (processNumber > max) max = processNumber;
        }

        System.out.println("En büyük sayı: " + max);
        System.out.println("En büyük sayı: " + min);
    }
}