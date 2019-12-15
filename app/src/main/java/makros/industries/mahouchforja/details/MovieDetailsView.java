package makros.industries.mahouchforja.details;

import java.util.List;

import makros.industries.mahouchforja.Movie;
import makros.industries.mahouchforja.Review;
import makros.industries.mahouchforja.Video;

/**
 * @author arun
 */
interface MovieDetailsView {
    void showDetails(Movie movie);

    void showTrailers(List<Video> trailers);

    void showReviews(List<Review> reviews);

    void showFavorited();

    void showUnFavorited();
}
