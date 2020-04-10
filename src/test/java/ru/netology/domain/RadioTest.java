package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RadioTest {
    @Test
    public void nextChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.nextChannel();
        assertEquals(6, radio.getCurrentChannel());
    }

    @Test
    public void nextChannelFromHundred() {
        Radio radio = new Radio();
        radio.setCurrentChannel(100);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void nextChannelFromMinusHundred() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-100);
        radio.nextChannel();
        assertEquals(1, radio.getCurrentChannel());
    }

    @Test
    public void nextChannelFromMaxChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(9);
        radio.nextChannel();
        assertEquals(0, radio.getCurrentChannel());
    }

    @Test
    public void previousChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(5);
        radio.previousChannel();
        assertEquals(4, radio.getCurrentChannel());
    }

    @Test
    public void previousChannelFromHundred() {
        Radio radio = new Radio();
        radio.setCurrentChannel(100);
        radio.previousChannel();
        assertEquals(8, radio.getCurrentChannel());
    }

    @Test
    public void previousChannelFromMinusHundred() {
        Radio radio = new Radio();
        radio.setCurrentChannel(-100);
        radio.previousChannel();
        assertEquals(9, radio.getCurrentChannel());
    }

    @Test
    public void previousChannelFromMinChannel() {
        Radio radio = new Radio();
        radio.setCurrentChannel(0);
        radio.previousChannel();
        assertEquals(9, radio.getCurrentChannel());
    }
}