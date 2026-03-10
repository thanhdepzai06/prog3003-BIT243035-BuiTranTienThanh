package com.mycompany.builderpatternexample;

public class BuilderPatternExample {

    public static void main(String[] args) {

        Computer computer1 = new Computer.ComputerBuilder("1TB", "16GB")
                .setBluetoothEnabled(true)
                .build();

        Computer computer2 = new Computer.ComputerBuilder("512GB", "8GB")
                .build();

        System.out.println("Computer 1:");
        computer1.showConfig();

        System.out.println("Computer 2:");
        computer2.showConfig();
    }
}