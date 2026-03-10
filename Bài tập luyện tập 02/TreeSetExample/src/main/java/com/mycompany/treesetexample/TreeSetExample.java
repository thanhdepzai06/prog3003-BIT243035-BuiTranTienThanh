package com.mycompany.treesetexample;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<String> names = new TreeSet<>();

        names.add("John");
        names.add("Alice");
        names.add("Zack");
        names.add("Bob");

        System.out.println("Danh sach sau khi sap xep:");

        for (String name : names) {
            System.out.println(name);
        }

        String first = names.first();

        String last = names.last();

        System.out.println("\nPhan tu nho nhat: " + first);
        System.out.println("Phan tu lon nhat: " + last);
    }
}