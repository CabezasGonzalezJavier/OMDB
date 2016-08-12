package com.thedeveloperworldisyours.omdb.requestack;

import com.thedeveloperworldisyours.omdb.model.Movie;
import com.thedeveloperworldisyours.omdb.model.Response;
import com.thedeveloperworldisyours.omdb.webservice.ResponseListener;

/**
 * Created by javierg on 08/08/16.
 */
public interface  ClientAsyncTask {
    public void executeAsync(ResponseListener mListener, String url, String type);
    public Response callClient(final String url, final String type);
}
