package com.thedeveloperworldisyours.omdb.webservice;

/**
 * Created by javierg on 10/08/16.
 */
public class ResponseFactory {

    public static ResponseImpl createResponse(ResponseHandler responseHandler) {
        return new ResponseImpl(responseHandler);
    }

}
