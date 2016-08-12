package com.thedeveloperworldisyours.omdb.interceptor;

import com.thedeveloperworldisyours.omdb.webservice.MovieResponseHandler;

/**
 * Created by javierg on 08/08/16.
 */
public interface MovieInterceptor {
    public void getMovie(final MovieResponseHandler movieResponseHandler, String string);
}
