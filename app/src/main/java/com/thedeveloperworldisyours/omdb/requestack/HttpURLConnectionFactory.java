package com.thedeveloperworldisyours.omdb.requestack;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by javierg on 08/08/16.
 */
public class HttpURLConnectionFactory {

    private static HttpURLConnection sConnection;
    private static boolean hasMockConnection;

    public static HttpURLConnection getHttpURLConnection(URL url) throws IOException {

        if(!hasMockConnection){
            sConnection = (HttpURLConnection) url.openConnection();
        } else {
            hasMockConnection = false;
        }

        return sConnection;
    }

    public static void setHttpURLConnection(HttpURLConnection mockReader) {
        sConnection = mockReader;
        hasMockConnection = true;
    }

}
