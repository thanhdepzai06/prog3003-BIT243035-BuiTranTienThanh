package com.example.bai1;

public class GenericMethodDemo {

    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5};
        String[] words = {"Java", "NetBeans", "Maven", "Generic"};

        System.out.println("=== Integer Array ===");
        printArray(numbers);

        System.out.println("\n=== String Array ===");
        printArray(words);
    }
}
