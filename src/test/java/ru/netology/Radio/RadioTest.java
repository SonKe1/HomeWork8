package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void currentRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(1);
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(7);
        rad.setNextRadioStation();
        int expected = 8;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(8);
        rad.setPrevRadioStation();
        int expected = 7;
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
        rad.setCurrentRadioVolume(5);
        rad.setIncreaseRadioVolume();
        int expected = 6;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setReductionRadioVolume() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(6);
        rad.setReductionRadioVolume();
        int expected = 5;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);
    }

    @Test
    public void setIncreaseRadioVolumeMax() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(10);
        rad.setIncreaseRadioVolume();
        int expected = 10;
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
    public void currentRadioStationOtherParams() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(10);
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void currentRadioVolumeOtherParams() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(12);
        int expected = 0;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void nextRadioStationOtherParams() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(9);
        rad.setNextRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationOtherParams() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(-1);
        rad.setPrevRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void setIncreaseRadioVolumeOtherParams() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(10);
        rad.setIncreaseRadioVolume();
        int expected = 10;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setReductionRadioVolumeOtherParams() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(-1);
        rad.setReductionRadioVolume();
        int expected = 0;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }
}