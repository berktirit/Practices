import java.util.Scanner;

public class ArithmeticPriority {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("a: ");
        int a = input.nextInt();
        System.out.print("b: ");
        int b = input.nextInt();
        System.out.print("c: ");
        int c = input.nextInt();

        int sum = a + b * c - b;
        System.out.println("Sum: " + sum);
    }
}
