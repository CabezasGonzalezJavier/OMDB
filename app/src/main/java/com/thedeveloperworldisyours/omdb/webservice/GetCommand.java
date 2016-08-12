package com.thedeveloperworldisyours.omdb.webservice;

/**
 * Created by javierg on 08/08/16.
 */
public class GetCommand implements Command{

    String mUrl;
    ResponseHandler mResponseHandler;
    Request mRequestImpl;

    public GetCommand(String mUrl, ResponseHandler mResponseHandler, Request mRequest) {
        this.mUrl = mUrl;
        this.mResponseHandler = mResponseHandler;
        this.mRequestImpl = mRequest;
    }

    @Override
    public void execute() {
        mRequestImpl.performGetRequest(mUrl, mResponseHandler);
    }
}
