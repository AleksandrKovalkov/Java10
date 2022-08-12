package ru.netology.domain;


public class Radioman {
    private int radio;
    private int volume;

    public int getRadio() {

        return radio;
    }

    public void setRadio(int radio) {
        if (radio < 0) {
            return;
        }
        if (radio > 9) {
            return;
        }
        this.radio = radio;
    }

    public void nextRadio() {
        if (radio < 9) {
            radio++;
        } else {
            radio = 0;
        }
    }

    public void prevRadio() {
        if (radio > 0) {
            radio--;
        } else {
            radio = 9;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        if (volume < 0) {
            return;
        }
        if (volume > 10) {
            volume = 10;
        }
        this.volume = volume;
    }

    public void volumeUp() {
        if (volume < 10) {
            volume++;
        }
    }

    public void volumeDown() {
        if (volume > 0) {
            volume--;
        }
    }

}