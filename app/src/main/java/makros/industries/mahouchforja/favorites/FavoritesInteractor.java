package makros.industries.mahouchforja.favorites;

import java.util.List;

import makros.industries.mahouchforja.Movie;

public interface FavoritesInteractor {
    void setFavorite(Movie movie);

    boolean isFavorite(String id);

    List<Movie> getFavorites();

    void unFavorite(String id);
}
