package makros.industries.mahouchforja.favorites;

import java.util.List;

import makros.industries.mahouchforja.Movie;

class FavoritesInteractorImpl implements FavoritesInteractor {
    private FavoritesStore favoritesStore;

    FavoritesInteractorImpl(FavoritesStore store) {
        favoritesStore = store;
    }

    @Override
    public void setFavorite(Movie movie) {
        favoritesStore.setFavorite(movie);
    }

    @Override
    public boolean isFavorite(String id) {
        return favoritesStore.isFavorite(id);
    }

    @Override
    public List<Movie> getFavorites() {
        return favoritesStore.getFavorites();
    }

    @Override
    public void unFavorite(String id) {
        favoritesStore.unfavorite(id);
    }
}
