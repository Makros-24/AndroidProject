package makros.industries.mahouchforja.listing;

import java.util.List;

import io.reactivex.Observable;
import makros.industries.mahouchforja.Movie;

public interface MoviesListingInteractor {
    boolean isPaginationSupported();

    Observable<List<Movie>> fetchMovies(int page);

    Observable<List<Movie>> searchMovie(String searchQuery);
}
