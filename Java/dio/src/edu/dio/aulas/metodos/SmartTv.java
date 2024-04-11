package edu.dio.aulas.metodos;

public class SmartTv {
    boolean power = false;
    int channel = 1;
    int volume = 25;

    public void PowerOn() {
        power = true;
    }
    public void PowerOff() {
        power = false;
    }

    public void chooseChannel(int numberChannel) {
        channel = numberChannel;
    }
    public void nextChannel() {
        channel++;
    }

    public void previousChannel() {
        channel--;
    }
    public void volumeUp() {
        volume++;
    }

    public void volumeDown() {
        volume--;
    }
}