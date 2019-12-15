package makros.industries.mahouchforja.details;

import java.util.List;

import io.reactivex.Observable;
import makros.industries.mahouchforja.Review;
import makros.industries.mahouchforja.Video;

public interface MovieDetailsInteractor {
    Observable<List<Video>> getTrailers(String id);

    Observable<List<Review>> getReviews(String id);
}
