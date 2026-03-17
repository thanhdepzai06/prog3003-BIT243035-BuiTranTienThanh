package com.mycompany.bai2_adapterpattern;

public class VlcPlayer implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        System.out.println("Dang phat file VLC: " + fileName);
    }
}