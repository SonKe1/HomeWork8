package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {


    @Test
    public void shouldMinRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxRadioStation() {
        Radio rad = new Radio(10);
        rad.setCurrentRadioStation(9);
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void currentRadioStationNegativeParams() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }


    @Test
    public void currentRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(2);
        int expected = 2;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        rad.setNextRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationForMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.setNextRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);
        rad.setPrevRadioStation();
        int expected = 4;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationForMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(0);
        rad.setPrevRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationForMax() {
        Radio rad = new Radio(12);
        rad.setCurrentRadioStation(9);
        rad.setPrevRadioStation();
        int expected = 8;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioStationMoreSpecifiedParams() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioVolume() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(2);
        int expected = 2;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setIncreaseRadioVolume() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(50);
        rad.setIncreaseRadioVolume();
        int expected = 51;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentRadioMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(100);
        int expected = 100;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentRadioMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(0);
        int expected = 0;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void currentRadioVolumeNegativeParams() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(-1);
        int expected = 0;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setReductionRadioVolume() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(60);
        rad.setReductionRadioVolume();
        int expected = 59;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseRadioVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(100);
        rad.setIncreaseRadioVolume();
        int expected = 100;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setReductionRadioVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(0);
        rad.setReductionRadioVolume();
        int expected = 0;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setReductionRadioVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(100);
        rad.setReductionRadioVolume();
        int expected = 99;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioVolumeBannedParams() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(102);
        int expected = 0;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setIncreaseRadioVolumeMin() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(0);
        rad.setIncreaseRadioVolume();
        int expected = 1;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }

}