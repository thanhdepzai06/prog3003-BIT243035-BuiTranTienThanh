package ex2;

public class EX2 {
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {

        Integer[] numbers = { 5, 10, 15, 20, 25 };

        System.out.println("Cac phan tu trong mang Integer:");
        printArray(numbers);

        String[] words = { "Xin", "chao", "Java", "Generic", "NetBeans" };

        System.out.println("Cac phan tu trong mang String:");
        printArray(words);

        Double[] doubles = { 1.5, 2.718, 3.14159 };
        System.out.println("Cac phan tu trong mang Double:");
        printArray(doubles);
    }
}
