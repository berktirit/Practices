package FifthWeek.StudentRecords;

public class Main {
    public static void main(String[] args) {
        // Birkaç öğrenci oluşturma
        Student student1 = new Student("Berk", "Tiritoğlu", "1001");
        Student student2 = new Student("Okan", "Erturan", "1002");
        Student student3 = new Student("Berk", "Tiritoğlu", "1001"); // student1 ile aynı bilgiler

        // Öğrencilerin bilgilerini ekrana yazdırma
        System.out.println(student1);
        System.out.println(student2);

        // equals() metodu testi
        System.out.println("student1 equals student3: " + student1.equals(student3)); // true
        System.out.println("student1 equals student2: " + student1.equals(student2)); // false

        // hashCode() metodu testi
        System.out.println("student1 hashCode: " + student1.hashCode());
        System.out.println("student3 hashCode: " + student3.hashCode()); // student1 ile aynı olmalı
    }
}