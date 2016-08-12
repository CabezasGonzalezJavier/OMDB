package com.thedeveloperworldisyours.omdb.requestack;

import com.thedeveloperworldisyours.omdb.webservice.ResponseListener;

/**
 * Created by javierg on 08/08/16.
 */
public class ClientHttpImpl implements ClientHTTP {

    private ResponseListener mListener;

    private ClientAsyncTask mAsyncTaskClient;

    public ClientHttpImpl(ResponseListener mListener) {
        this.mListener = mListener;
    }

    @Override
    public void get(String url) {
        this.mAsyncTaskClient = new ClientAsyncTaskImpl();

    }

    @Override
    public void post(String url) {

    }

    @Override
    public void put(String url) {

    }

    @Override
    public void delete(String url) {

    }
}
