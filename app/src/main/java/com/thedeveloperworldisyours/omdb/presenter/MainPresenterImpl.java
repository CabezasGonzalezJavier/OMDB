package com.thedeveloperworldisyours.omdb.presenter;

import android.util.Log;

import com.thedeveloperworldisyours.omdb.interceptor.MovieInterceptor;
import com.thedeveloperworldisyours.omdb.interceptor.MovieInterceptorImpl;
import com.thedeveloperworldisyours.omdb.model.Movie;
import com.thedeveloperworldisyours.omdb.utils.Constants;
import com.thedeveloperworldisyours.omdb.view.MainView;
import com.thedeveloperworldisyours.omdb.webservice.MovieResponseHandler;

/**
 * Created by javierg on 15/08/16.
 */
public class MainPresenterImpl implements MovieResponseHandler, MainPresenter {

    private MainView mMainView;
    private MovieInterceptor mMovieInterceptor;

    public MainPresenterImpl(MainView mMainView) {
        this.mMainView = mMainView;
        this.mMovieInterceptor = new MovieInterceptorImpl();
    }

    @Override
    public void handMovie(Movie fuseClient) {
        mMainView.onHideProgress();
        mMainView.onSuccessful();

    }

    @Override
    public void sendResponseFail(String error) {
        mMainView.onHideProgress();
        mMainView.onError();
    }

    @Override
    public void getMovie() {
        mMainView.onShowProgress();
        mMovieInterceptor.getMovie(this, Constants.URL);
    }

    @Override
    public void onDestroy() {
        mMainView = null;
    }
}
