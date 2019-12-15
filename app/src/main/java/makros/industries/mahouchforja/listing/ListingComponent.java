package makros.industries.mahouchforja.listing;

import dagger.Subcomponent;
import makros.industries.mahouchforja.listing.sorting.SortingDialogFragment;
import makros.industries.mahouchforja.listing.sorting.SortingModule;

@ListingScope
@Subcomponent(modules = {ListingModule.class, SortingModule.class})
public interface ListingComponent {
    MoviesListingFragment inject(MoviesListingFragment fragment);

    SortingDialogFragment inject(SortingDialogFragment fragment);
}
