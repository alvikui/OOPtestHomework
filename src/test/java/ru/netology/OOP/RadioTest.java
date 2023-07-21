package ru.netology.OOP;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    // Номер станции
    @Test
    public void shouldMinStation() {
        radio.setCurrentStation(radio.getMinStation());

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMiddleStation() {
        radio.setCurrentStation(5);

        int expected = 5;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxStation() {
        radio.setCurrentStation(9);

        int expected = 9;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverMaxStation() {
        radio.setCurrentStation(15);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUnderMinStation() {
        radio.setCurrentStation(-8);

        int expected = 0;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Кнопка next
    @Test
    public void shouldNextMinStation() {
        radio.setCurrentStation(radio.getMinStation());
        radio.nextStation();

        int expected = 1;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextMaxStation() {
        radio.setCurrentStation(radio.getMaxStation());
        radio.nextStation();

        int expected = radio.getMinStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Кнопка prev
    @Test
    public void shouldPrevMinStation() {
        radio.setCurrentStation(radio.getMinStation());
        radio.prevStation();

        int expected = radio.getMaxStation();
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevMaxStation() {
        radio.setCurrentStation(9);
        radio.prevStation();

        int expected = 8;
        int actual = radio.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    // Громкость
    @Test
    public void shouldMinVolume() {
        radio.setCurrentVolume(radio.getMinVolume());

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMiddleVolume() {
        radio.setCurrentVolume(55);

        int expected = 55;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMaxVolume() {
        radio.setCurrentVolume(radio.getMaxVolume());

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldOverMaxVolume() {
        radio.setCurrentVolume(120);

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUnderMinVolume() {
        radio.setCurrentVolume(-6);

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Кнопка +
    @Test
    public void shouldUpMinVolume() {
        radio.setCurrentVolume(radio.getMinVolume());
        radio.increaseVolume();

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldUpMaxVolume() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    // Кнопка -
    @Test
    public void shouldDownMinVolume() {
        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();

        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDownMaxVolume() {
        radio.setCurrentVolume(radio.getMaxVolume());
        radio.decreaseVolume();

        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


}
