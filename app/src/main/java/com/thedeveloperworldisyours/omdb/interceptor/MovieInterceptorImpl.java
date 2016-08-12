package com.thedeveloperworldisyours.omdb.interceptor;

import com.google.gson.Gson;
import com.thedeveloperworldisyours.omdb.model.Movie;
import com.thedeveloperworldisyours.omdb.webservice.CommandFactory;
import com.thedeveloperworldisyours.omdb.webservice.MovieResponseHandler;
import com.thedeveloperworldisyours.omdb.webservice.ResponseHandler;

/**
 * Created by javierg on 08/08/16.
 */
public class MovieInterceptorImpl implements MovieInterceptor {

    private CommandFactory mCommandFactory = new CommandFactory();

    @Override
    public void getMovie(final MovieResponseHandler movieResponseHandler, String string) {

        ResponseHandler handler = new ResponseHandler() {

            @Override
            public void sendResponseSuccessful(String response) {
                Gson gson = new Gson();
                Movie movie = gson.fromJson(response, Movie.class);
                movieResponseHandler.handMovie(movie);
            }

            @Override
            public void sendResponseFail(String error) {

                movieResponseHandler.sendResponseFail(error);
            }
        };

        mCommandFactory.createGetCommand(string, handler).execute();
    }
}
