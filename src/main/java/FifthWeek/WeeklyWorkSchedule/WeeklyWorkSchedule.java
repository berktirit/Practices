package FifthWeek.WeeklyWorkSchedule;

import java.util.Scanner;

/**
 * Kullanıcıdan gün ismi alarak o günün çalışma saatlerini gösteren ana sınıf.
 */
public class WeeklyWorkSchedule {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day to check working hours (e.g., MONDAY): ");
        String input = scanner.nextLine().toUpperCase(); // Girişi büyük harfe çevirerek enum ile eşleşmesini sağla

        try {
            // Kullanıcı girişini ilgili Day enum değerine çevir
            Day day = Day.valueOf(input);

            // Seçilen günün çalışma saatlerini yazdır
            System.out.println("Working hours on " + day + ": " + day.getWorkingHours());
        } catch (IllegalArgumentException e) {
            // Hatalı gün girildiğinde uyarı ver
            System.out.println("Invalid day entered. Please enter a valid day name.");
        }

        scanner.close();
    }
}