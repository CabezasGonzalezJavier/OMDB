package com.thedeveloperworldisyours.omdb.webservice;

/**
 * Created by javierg on 10/08/16.
 */
public class RequestFactory {

    private static RequestImpl sRequestImpl;

    public static RequestImpl createResponseListener () {

        if (sRequestImpl == null){
            sRequestImpl = new RequestImpl();
        }

        return sRequestImpl;
    }

    public static void setMockRequest(RequestImpl requestImpl){
        sRequestImpl = requestImpl;

    }
}
