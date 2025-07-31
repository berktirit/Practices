package ThirdWeek;

public class GenericPrinter {

    // Generic bir metot tanımlanıyor: T herhangi bir veri türünü temsil eder
    public static <T> void printArray(T[] array) {
        // Her bir dizi elemanını sırayla yazdırır
        for (T element : array) {
            System.out.print(element + " "); // Elemanı ve boşluk ile birlikte yazdırır
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5}; // Integer türünde bir dizi oluşturuluyor
        String[] stringArray = {"Java", "Generics", "Ödev"}; // String türünde bir dizi oluşturuluyor

        // printArray metodu çağırılarak diziler yazdırılıyor
        printArray(intArray);
        printArray(stringArray);
    }
}