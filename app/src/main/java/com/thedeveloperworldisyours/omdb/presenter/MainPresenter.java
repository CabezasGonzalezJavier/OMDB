package com.thedeveloperworldisyours.omdb.presenter;

import com.thedeveloperworldisyours.omdb.model.Movie;
import com.thedeveloperworldisyours.omdb.view.MainView;
import com.thedeveloperworldisyours.omdb.webservice.MovieResponseHandler;

/**
 * Created by javierg on 08/08/16.
 */
public interface MainPresenter {
    public void getMovie();
    public void onDestroy();
}
