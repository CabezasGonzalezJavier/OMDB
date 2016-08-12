package com.thedeveloperworldisyours.omdb.webservice;

/**
 * Created by javierg on 10/08/16.
 */
public class CommandFactory {

    public static Command createGetCommand(String mUrl, ResponseHandler handler){
        Request request = RequestFactory.createResponseListener();

        return new GetCommand(mUrl, handler, request);
    }

}
