package com.thedeveloperworldisyours.omdb.view;

import com.thedeveloperworldisyours.omdb.model.Movie;

/**
 * Created by javierg on 08/08/16.
 */
public interface MainView {
    public void onError();

    public void onSuccessful(Movie movie);

    public void onShowProgress();

    public void onHideProgress();
}
