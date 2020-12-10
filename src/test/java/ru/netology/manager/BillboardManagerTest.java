package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.FilmItem;
import ru.netology.manager.BillboardManager;

import static org.junit.jupiter.api.Assertions.*;

public class BillboardManagerTest {
    private BillboardManager manager = new BillboardManager();
    private BillboardManager manager5 = new BillboardManager(5);
    private FilmItem first = new FilmItem(1, "first", "comedy", "http1");
    private FilmItem second = new FilmItem(2, "second", "comedy", "http2");
    private FilmItem third = new FilmItem(3, "third", "comedy", "http3");
    private FilmItem fourth = new FilmItem(4, "fourth", "comedy", "http4");
    private FilmItem fifth = new FilmItem(5, "fifth", "comedy", "http5");
    private FilmItem sixth = new FilmItem(6, "sixth", "comedy", "http6");
    private FilmItem seventh = new FilmItem(7, "seventh", "comedy", "http7");
    private FilmItem eighth = new FilmItem(8, "eighth", "comedy", "http8");
    private FilmItem ninth = new FilmItem(9, "ninth", "comedy", "http9");
    private FilmItem tenth = new FilmItem(10, "tenth", "comedy", "http10");
    private FilmItem eleventh = new FilmItem(10, "eleventh", "comedy", "http10");

    @Test
    public void setUpOneFilms() {
        manager.add(first);

        FilmItem[] actual = manager.getAll();
        FilmItem[] expected = new FilmItem[]{first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void setUpThreeFilms() {
        manager.add(first);
        manager.add(second);
        manager.add(third);

        FilmItem[] actual = manager.getAll();
        FilmItem[] expected = new FilmItem[]{third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void setUpLastTenFilmsIfMoreFilms() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

        FilmItem[] actual = manager.getAll();
        FilmItem[] expected = new FilmItem[]{eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        assertArrayEquals(expected, actual);
    }
    @Test
    public void setUpTenFilms() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);

        FilmItem[] actual = manager.getAll();
        FilmItem[] expected = new FilmItem[]{tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMakeDefaultSetUpForFiveFilmsIfMore() {
        manager5.add(first);
        manager5.add(second);
        manager5.add(third);
        manager5.add(fourth);
        manager5.add(fifth);
        manager5.add(sixth);
        manager5.add(seventh);
        manager5.add(eighth);
        manager5.add(ninth);
        manager5.add(tenth);

        FilmItem[] actual = manager5.getAll();
        FilmItem[] expected = new FilmItem[]{tenth, ninth, eighth, seventh, sixth};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMakeDefaultSetUpForFiveFilmsIfLessThenFive() {
        manager5.add(first);
        manager5.add(second);
        manager5.add(third);
        manager5.add(fourth);

        FilmItem[] actual = manager5.getAll();
        FilmItem[] expected = new FilmItem[]{fourth, third, second, first};

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldMakeDefaultSetUpForFiveFilmsIfOneFilm() {
        manager5.add(first);

        FilmItem[] actual = manager5.getAll();
        FilmItem[] expected = new FilmItem[]{first};

        assertArrayEquals(expected, actual);
    }
}
