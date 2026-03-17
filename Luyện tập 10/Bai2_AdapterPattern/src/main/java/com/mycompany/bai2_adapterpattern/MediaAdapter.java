package com.mycompany.bai2_adapterpattern;

public class MediaAdapter implements MediaPlayer {
    private AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter() {
        advancedMediaPlayer = new VlcPlayer();
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMediaPlayer.playVlc(fileName);
        } else {
            System.out.println("Khong ho tro dinh dang: " + audioType);
        }
    }
}