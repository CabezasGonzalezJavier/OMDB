package com.thedeveloperworldisyours.omdb.webservice;

import com.thedeveloperworldisyours.omdb.model.Movie;

/**
 * Created by javierg on 12/08/16.
 */
public interface MovieResponseListener {
    public void onSuccess(Movie successResponse);

    public void onError(String errorResponse);
}
