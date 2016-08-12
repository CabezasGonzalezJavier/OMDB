package com.thedeveloperworldisyours.omdb.webservice;

import com.thedeveloperworldisyours.omdb.model.Movie;

/**
 * Created by javierg on 12/08/16.
 */
public interface MovieResponseHandler {
    public void handMovie(Movie fuseClient);
    public void sendResponseFail(String error);
}
