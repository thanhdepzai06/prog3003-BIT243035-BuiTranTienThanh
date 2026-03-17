package com.mycompany.bai2_adapterpattern;

public class Bai2_AdapterPattern implements MediaPlayer {

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("mp3")) {
            System.out.println("Dang phat file MP3: " + fileName);
        } else if (audioType.equalsIgnoreCase("vlc")) {
            MediaAdapter adapter = new MediaAdapter();
            adapter.play(audioType, fileName);
        } else {
            System.out.println("Khong ho tro dinh dang: " + audioType);
        }
    }

    public static void main(String[] args) {
        Bai2_AdapterPattern player = new Bai2_AdapterPattern();

        player.play("mp3", "baihat.mp3");
        player.play("vlc", "nhac.vlc");
    }
}