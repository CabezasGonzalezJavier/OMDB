package com.thedeveloperworldisyours.omdb.webservice;

/**
 * Created by javierg on 08/08/16.
 */
public interface ResponseHandler {

    public void sendResponseSuccessful(String response);
    public void sendResponseFail(String error);

}
