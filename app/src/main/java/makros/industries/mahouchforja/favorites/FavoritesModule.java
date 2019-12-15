package makros.industries.mahouchforja.favorites;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import makros.industries.mahouchforja.AppModule;

@Module(includes = AppModule.class)
public class FavoritesModule {
    @Provides
    @Singleton
    FavoritesInteractor provideFavouritesInteractor(FavoritesStore store) {
        return new FavoritesInteractorImpl(store);
    }
}
