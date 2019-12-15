package makros.industries.mahouchforja.listing;

import dagger.Module;
import dagger.Provides;
import makros.industries.mahouchforja.favorites.FavoritesInteractor;
import makros.industries.mahouchforja.listing.sorting.SortingOptionStore;
import makros.industries.mahouchforja.network.TmdbWebService;

@Module
public class ListingModule {
    @Provides
    MoviesListingInteractor provideMovieListingInteractor(FavoritesInteractor favoritesInteractor,
                                                          TmdbWebService tmdbWebService,
                                                          SortingOptionStore sortingOptionStore) {
        return new MoviesListingInteractorImpl(favoritesInteractor, tmdbWebService, sortingOptionStore);
    }

    @Provides
    MoviesListingPresenter provideMovieListingPresenter(MoviesListingInteractor interactor) {
        return new MoviesListingPresenterImpl(interactor);
    }
}
