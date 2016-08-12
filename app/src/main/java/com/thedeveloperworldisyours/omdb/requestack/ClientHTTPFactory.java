package com.thedeveloperworldisyours.omdb.requestack;

import com.thedeveloperworldisyours.omdb.webservice.ResponseListener;

/**
 * Created by javierg on 08/08/16.
 */
public class ClientHTTPFactory {
    private static ClientHTTP sClientHTTP;
    private static boolean sConnection;

    public static ClientHTTP createResponseListener(ResponseListener responseListener){

        if (!sConnection) {
            sClientHTTP = new ClientHttpImpl(responseListener);
        } else {
            sConnection = false;
        }
        return sClientHTTP;
    }

    public static void setMockClientHTTP(ClientHTTP clientHTTP){
        sClientHTTP = clientHTTP;
        sConnection = true;
    }
}
