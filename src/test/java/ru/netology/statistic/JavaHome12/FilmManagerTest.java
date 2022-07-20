package ru.netology.statistic.JavaHome12;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class FilmManagerTest {

    @Test
    public void ShowAllFilms() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm("One");
        manager.addNewFilm("Two");
        manager.addNewFilm("Three");
        manager.addNewFilm("Four");

        String[] expected = {"One", "Two", "Three", "Four"};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }
    @Test
    public void ShowAllFilmsIfAddOne() {
        FilmManager manager = new FilmManager();
        manager.addNewFilm("Five");
        String[] expected = {"Five"};
        String[] actual = manager.findAll();
        assertArrayEquals(expected,actual);
    }
    @Test
    public void ShowAllFilmsIfNoAdd() {
        FilmManager manager = new FilmManager();
        String[] expected;
        expected = new String[]{};
        String[] actual = manager.findAll();
        assertArrayEquals(expected, actual);
    }
    @Test
    public  void ShowLastLimitFilms() {
        FilmManager manager = new FilmManager(11);
        manager.addNewFilm("f1");
        manager.addNewFilm("f2");
        manager.addNewFilm("f3");
        manager.addNewFilm("f4");
        manager.addNewFilm("f5");
        manager.addNewFilm("f6");
        manager.addNewFilm("f7");
        manager.addNewFilm("f8");
        manager.addNewFilm("f9");
        manager.addNewFilm("f10");
        manager.addNewFilm("f11");
        manager.addNewFilm("f12");
        manager.addNewFilm("f13");

        String[] expected = {
                "f13",
                "f12",
                "f11",
                "f10",
                "f9",
                "f8",
                "f7",
                "f6",
                "f5",
                "f4",
                "f3"
        };
        String[] actual = manager.findLast();
        assertArrayEquals(expected,actual);
    }
    @Test
    public void ShowLastFilmsIfAddUnderLimit() {
        FilmManager manager = new FilmManager(4);
        manager.addNewFilm("f1");
        manager.addNewFilm("f2");
        manager.addNewFilm("f3");
        manager.addNewFilm("f4");

        String[] expected = {
                "f4",
                "f3",
                "f2",
                "f1"
        };
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }
}
