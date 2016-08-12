package com.thedeveloperworldisyours.omdb.webservice;

/**
 * Created by javierg on 08/08/16.
 */
public class RequestImpl implements Request{
    @Override
    public void performGetRequest(String url, ResponseHandler responseHandler) {

        ResponseListener responseListener = ResponseFactory.createResponse(responseHandler);
    }

    @Override
    public void performPutRequest(String url, ResponseHandler responseHandler) {

    }

    @Override
    public void performPostRequest(String url, ResponseHandler responseHandler) {

    }

    @Override
    public void performDeleteRequest(String url, ResponseHandler responseHandler) {

    }
}
