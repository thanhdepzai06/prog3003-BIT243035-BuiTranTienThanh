package com.mycompany.javaassignment.bai1;

import com.mycompany.javaassignment.bai1.Student;
import java.util.ArrayList;
import java.util.Scanner;

public class JavaAssignment {

    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
System.out.println("\n===== MENU QUAN LY SINH VIEN =====");
System.out.println("1. Them sinh vien");
System.out.println("2. Hien thi danh sach");
System.out.println("3. Tim kiem theo ten");
System.out.println("4. Xoa theo MSSV");
System.out.println("0. Thoat");
System.out.print("Chon chuc nang: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    showStudents();
                    break;
                case 3:
                    searchByName();
                    break;
                case 4:
                    deleteByMssv();
                    break;
                case 0:
                    System.out.println("Exit...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void addStudent() {
        System.out.print("Enter MSSV: ");
        String mssv = sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter GPA: ");
        double gpa = sc.nextDouble();
        sc.nextLine();

        list.add(new Student(mssv, name, gpa));
        System.out.println("Added successfully!");
    }

    static void showStudents() {
        if (list.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : list) {
            System.out.println(s);
        }
    }

    static void searchByName() {
        System.out.print("Enter name to search: ");
        String name = sc.nextLine();

        boolean found = false;

        for (Student s : list) {
            if (s.getName().equalsIgnoreCase(name)) {
                System.out.println(s);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student not found.");
        }
    }

    static void deleteByMssv() {
        System.out.print("Enter MSSV to delete: ");
        String mssv = sc.nextLine();

        boolean removed = list.removeIf(s -> s.getMssv().equals(mssv));

        if (removed) {
            System.out.println("Deleted successfully!");
        } else {
            System.out.println("Student not found.");
        }
    }
}