package makros.industries.mahouchforja;

import javax.inject.Singleton;

import dagger.Component;
import makros.industries.mahouchforja.details.DetailsComponent;
import makros.industries.mahouchforja.details.DetailsModule;
import makros.industries.mahouchforja.favorites.FavoritesModule;
import makros.industries.mahouchforja.listing.ListingComponent;
import makros.industries.mahouchforja.listing.ListingModule;
import makros.industries.mahouchforja.network.NetworkModule;

@Singleton
@Component(modules = {
        AppModule.class,
        NetworkModule.class,
        FavoritesModule.class})
public interface AppComponent {
    DetailsComponent plus(DetailsModule detailsModule);

    ListingComponent plus(ListingModule listingModule);
}
