package com.mycompany.bai1_hashmap;

import java.util.HashMap;

public class Bai1_HashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> employees = new HashMap<>();

        employees.put(101, "Anna");
        employees.put(102, "Peter");
        employees.put(103, "Mary");

        String employeeName = employees.get(102);
        System.out.println("Ten nhan vien co ID 102: " + employeeName);

        if (!employees.containsKey(105)) {
            employees.put(105, "Unknown");
            System.out.println("ID 105 chua ton tai, da them nhan vien Unknown.");
        }

        System.out.println("\nDanh sach nhan vien:");
        for (Integer id : employees.keySet()) {
            System.out.println(id + " - " + employees.get(id));
        }
    }
}