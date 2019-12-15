package makros.industries.mahouchforja.details;

import java.util.List;

import io.reactivex.Observable;
import makros.industries.mahouchforja.Review;
import makros.industries.mahouchforja.ReviewsWrapper;
import makros.industries.mahouchforja.Video;
import makros.industries.mahouchforja.VideoWrapper;
import makros.industries.mahouchforja.network.TmdbWebService;

class MovieDetailsInteractorImpl implements MovieDetailsInteractor {

    private TmdbWebService tmdbWebService;

    MovieDetailsInteractorImpl(TmdbWebService tmdbWebService) {
        this.tmdbWebService = tmdbWebService;
    }

    @Override
    public Observable<List<Video>> getTrailers(final String id) {
        return tmdbWebService.trailers(id).map(VideoWrapper::getVideos);
    }

    @Override
    public Observable<List<Review>> getReviews(final String id) {
        return tmdbWebService.reviews(id).map(ReviewsWrapper::getReviews);
    }

}
