package ru.netology.Radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    public void currentRadioStation() {
        Radio rad = new Radio();
        rad.setCurrentRadioStation(5);
        int expected = 5;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation() {
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
        rad.setCurrentRadioStation(0);
        rad.setPrevRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        assertEquals(expected, actual);

    }

    @Test
    public void currentRadioVolume() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(4);
        int expected = 4;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setIncreaseRadioVolume() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(10);
        rad.setIncreaseRadioVolume();
        int expected = 10;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }

    @Test
    public void setReductionRadioVolume() {
        Radio rad = new Radio();
        rad.setCurrentRadioVolume(0);
        rad.setReductionRadioVolume();
        int expected = 0;
        int actual = rad.getCurrentRadioVolume();
        assertEquals(expected, actual);

    }

}