
package ru.netology.Radio;

public class Radio {
    // Станции
    private int currentRadioStation;
    private int maxRadioStation = 9;
    private int minRadioStation = 0;
    // Громкость
    private int currentRadioVolume;
    private int maxRadioVolume = 100;
    private int minRadioVolume = 0;

    public Radio() {
    }

    public Radio(int radioStationCount) {
        maxRadioStation = radioStationCount - 1;
    }

    // Станции
    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation < minRadioStation) {
            return;
        }
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void setNextRadioStation() {
        if (currentRadioStation < maxRadioStation) {
            currentRadioStation = currentRadioStation + 1;
        } else {
            currentRadioStation = minRadioStation;
        }
    }

    public void setPrevRadioStation() {
        if (currentRadioStation > minRadioStation) {
            currentRadioStation = currentRadioStation - 1;
        } else {
            currentRadioStation = maxRadioStation;
        }
    }

    // Громкость
    public int getCurrentRadioVolume() {
        return currentRadioVolume;
    }

    public void setCurrentRadioVolume(int currentRadioVolume) {
        if (currentRadioVolume < minRadioVolume) {
            return;
        }
        if (currentRadioVolume > maxRadioVolume) {
            return;
        }
        this.currentRadioVolume = currentRadioVolume;
    }

    public void setIncreaseRadioVolume() {
        if (currentRadioVolume < maxRadioVolume) {
            currentRadioVolume = currentRadioVolume + 1;
        }
    }

    public void setReductionRadioVolume() {
        if (currentRadioVolume > minRadioVolume) {
            currentRadioVolume = currentRadioVolume - 1;
        }
    }
}
