package com.mycompany.builderpatternexample;

public class Computer {

    private String HDD;
    private String RAM;

    private boolean bluetoothEnabled;

    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.bluetoothEnabled = builder.bluetoothEnabled;
    }

    public void showConfig() {
        System.out.println("HDD: " + HDD);
        System.out.println("RAM: " + RAM);
        System.out.println("Bluetooth: " + bluetoothEnabled);
        System.out.println("----------------------");
    }

    public static class ComputerBuilder {

        private String HDD;
        private String RAM;
        private boolean bluetoothEnabled;

        public ComputerBuilder(String HDD, String RAM) {
            this.HDD = HDD;
            this.RAM = RAM;
        }

        public ComputerBuilder setBluetoothEnabled(boolean bluetoothEnabled) {
            this.bluetoothEnabled = bluetoothEnabled;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}