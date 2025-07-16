package Week1;

import java.util.Scanner;

public class BodyMass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz: ");
        double height = input.nextDouble();

        System.out.print("Lütfen kilonuzu giriniz: ");
        double weight = input.nextDouble();

        double bodyMass = weight / (height * height);
        System.out.println("Vücut Kilte İndeksiniz: " + bodyMass);
    }
}