package SecondWeek.EmployeeSalary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String name;
        double salary = 0;
        int workHours = 0;
        int startYear = 0;

        // İsimde sadece harf ve boşluk kabul edilir
        while (true) {
            System.out.print("Çalışanın adı: ");
            name = input.nextLine();
            if (name.matches("[a-zA-ZçÇğĞıİöÖşŞüÜ\\s]+")) {
                break;
            } else {
                System.out.println("Lütfen sadece harf kullanın. Sayı veya özel karakter girmeyin.");
            }
        }

        // Maaş sayı olmalı
        while (true) {
            System.out.print("Maaşı: ");
            if (input.hasNextDouble()) {
                salary = input.nextDouble();
                break;
            } else {
                System.out.println("Lütfen geçerli bir sayı giriniz.");
                input.next();
            }
        }

        // Haftalık çalışma saati sayı olmalı
        while (true) {
            System.out.print("Haftalık çalışma saati: ");
            if (input.hasNextInt()) {
                workHours = input.nextInt();
                break;
            } else {
                System.out.println("Lütfen geçerli bir tam sayı giriniz.");
                input.next();
            }
        }

        // İşe giriş yılı sayı olmalı ve 1970 veya sonrası olmalı
        while (true) {
            System.out.print("İşe başlama yılı: ");
            if (input.hasNextInt()) {
                startYear = input.nextInt();
                if (startYear >= 1970) {
                    break;
                } else {
                    System.out.println("1970 yılı öncesine ait çalışan kayıtlarımız arşivde yer almamaktadır.");
                }
            } else {
                System.out.println("Lütfen geçerli bir yıl giriniz (örnek: 2005).");
                input.next();
            }
        }

        // employee nesnesi oluşturulur
        Employee employee = new Employee(name, salary, workHours, startYear);

        System.out.println("\n------------------------------------------------------------"); // output süslemek için
        System.out.println("\nÇalışan Bilgileri:\n");
        System.out.println(employee);
        System.out.println("\n------------------------------------------------------------"); // output süslemek için
    }
}