package com.thedeveloperworldisyours.omdb.webservice;

/**
 * Created by javierg on 08/08/16.
 */
public interface ResponseListener {

    public void onSuccess(final String successResponse);
    public void onError(final String errorResponse);
    public void onGeneralError();

}
