public class FilmManager {

    public Film[] films = new Film[0];
    public int amountFilms;

    public FilmManager(int amountFilms) {
        //this.films = films;
        this.amountFilms = amountFilms;
    }

    public FilmManager() {
        this.amountFilms = 5;
        //this.films = films;
    }

    public void save(Film film) {
        Film[] tmp = new Film[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public Film[] getFilmsFindAll() {
        return films;
    }

    public Film[] getFilmsFindLast() {
        int resultLength;
        if (amountFilms == 5) {
            resultLength = 5;
        } else {
            resultLength = amountFilms;
        }
        Film[] all = getFilmsFindAll();
        Film[] result = new Film[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = all[all.length - 1 - i];
        }
        return result;
    }

}
