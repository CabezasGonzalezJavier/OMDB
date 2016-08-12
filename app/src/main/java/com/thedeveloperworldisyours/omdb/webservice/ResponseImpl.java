package com.thedeveloperworldisyours.omdb.webservice;

/**
 * Created by javierg on 10/08/16.
 */
public class ResponseImpl implements ResponseListener {

    private ResponseHandler mResponseHandler;

    public ResponseImpl(ResponseHandler responseHandler){

        mResponseHandler = responseHandler;
    }

    @Override
    public void onSuccess(String successResponse) {
        mResponseHandler.sendResponseSuccessful(successResponse);
    }

    @Override
    public void onError(String errorResponse) {

    }

    @Override
    public void onGeneralError() {

    }
}
