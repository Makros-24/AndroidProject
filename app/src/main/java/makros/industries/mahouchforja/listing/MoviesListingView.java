package makros.industries.mahouchforja.listing;

import java.util.List;

import makros.industries.mahouchforja.Movie;

interface MoviesListingView {
    void showMovies(List<Movie> movies);

    void loadingStarted();

    void loadingFailed(String errorMessage);

    void onMovieClicked(Movie movie);
}
