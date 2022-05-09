
package ru.netology.Radio;

public class Radio {

    private int currentRadioStation;
    private int currentRadioVolume;

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public int getCurrentRadioVolume() {

        return currentRadioVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (currentRadioStation < 0) {
            return;
        }
        if (currentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;

    }


    public void setNextRadioStation() {
        if (currentRadioStation < 9) {
            currentRadioStation = currentRadioStation + 1;
        } else currentRadioStation = 0;

    }

    public void setPrevRadioStation() {
        if (currentRadioStation > 0) {
            currentRadioStation = currentRadioStation - 1;
        } else currentRadioStation = 9;
    }

    public void setCurrentRadioVolume(int newCurrentRadioVolume) {
        if (currentRadioVolume > 10) {
            return;
        }
        if (currentRadioVolume < 0) {
            return;
        }
        currentRadioVolume = newCurrentRadioVolume;
    }

    public void setIncreaseRadioVolume() {
        if (currentRadioVolume < 10) {
            currentRadioVolume = currentRadioVolume + 1;
        } else currentRadioVolume = 10;
    }

    public void setReductionRadioVolume() {
        if (currentRadioVolume > 0) {
            currentRadioVolume = currentRadioVolume - 1;
        } else currentRadioVolume = 0;
    }


}
