package ru.netology.javaqa.radio.java;

public class Radio {
    private int minStationNumber = 0;
    private int maxStationNumber = 10;

    private int currentStationNumber;
    private int soundVolume;
    private int minSoundVolume = 0;
    private int maxSoundVolume = 100;


    public Radio(int station) {
        maxStationNumber = station - 1;
    }

    public Radio() {

        maxStationNumber = 9;
    }

    public void next() {
        if (currentStationNumber != maxStationNumber) {
            currentStationNumber++;
        } else {
            currentStationNumber = minStationNumber;
        }
    }

    public void prev() {
        if (currentStationNumber != minStationNumber) {
            currentStationNumber--;
        } else {
            currentStationNumber = maxStationNumber;
        }
    }

    public void increaseVolume() {
        if (soundVolume < maxSoundVolume) {
            soundVolume = soundVolume + 1;
        } else {
            soundVolume = maxSoundVolume;
        }
    }

    public void decreaseVolume() {
        if (soundVolume > minSoundVolume) {
            soundVolume = soundVolume - 1;
        } else {
            soundVolume = minSoundVolume;
        }
    }

    public int getCurrentStationNumber() {
        return currentStationNumber;
    }

    public int getMaxStationNumber() {
        return maxStationNumber;
    }

    public int getMinStationNumber() {
        return minStationNumber;
    }

    public void setCurrentStationNumber(int currentStationNumber) {
        if (currentStationNumber < minStationNumber) {
            return;
        }
        if (currentStationNumber > maxStationNumber) {
            return;
        }
        this.currentStationNumber = currentStationNumber;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume < minSoundVolume) {
            return;
        }
        if (soundVolume > maxSoundVolume) {
            return;
        }
        this.soundVolume = soundVolume;
    }

}

