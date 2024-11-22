import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FilmManagerTest {
    Film film1 = new Film(11, 1, "Матрица");
    Film film2 = new Film(222, 22, "Чародеи");
    Film film3 = new Film(3, 30, "Морозко");

    @Test
    public void testFindAll() {
        FilmManager film = new FilmManager(3);
        film.save(film1);
        film.save(film2);
        film.save(film3);

        Film[] expected = {film1, film2, film3};
        Film[] actual = film.getFilmsFindAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testFindLast() {
        FilmManager film = new FilmManager(3);
        film.save(film1);
        film.save(film2);
        film.save(film3);

        Film[] expected = {film3, film2, film1};
        Film[] actual = film.getFilmsFindLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}
