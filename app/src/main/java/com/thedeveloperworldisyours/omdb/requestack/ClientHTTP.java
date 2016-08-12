package com.thedeveloperworldisyours.omdb.requestack;

/**
 * Created by javierg on 08/08/16.
 */
public interface ClientHTTP {
    void get(String url);
    void post(String url);
    void put(String url);
    void delete(String url);
}
