package com.mycompany.javatest;

public class JavaTest {

    public static void main(String[] args) {

        StudentManager<Student> manager = new StudentManager<>();

        manager.add(new Student("SV01", "Tien Thanh", 3.2));
        manager.add(new Student("SV02", "Xuan Thanh", 3.6));
        manager.add(new Student("SV03", "Van Viet", 2.9));

        for (Student s : manager.getAll()) {
            System.out.println(s);
        }
    }
}