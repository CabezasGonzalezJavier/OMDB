package com.thedeveloperworldisyours.omdb;

import com.thedeveloperworldisyours.omdb.webservice.ResponseHandler;
import com.thedeveloperworldisyours.omdb.webservice.ResponseImpl;
import com.thedeveloperworldisyours.omdb.webservice.ResponseListener;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by javierg on 12/08/16.
 */
public class ResponseTest {

    private String mResponse;
    private ResponseHandler mMockResponseHandler;
    public ResponseListener mMockResponseListener;

    @Before
    public void setUp() {
        mResponse = "something";
        mMockResponseHandler = mock(ResponseHandler.class);
        mMockResponseListener = mock(ResponseListener.class);
    }

    @Test
    public void successful() {

        mMockResponseListener.onSuccess(mResponse);

        assertNotNull(mResponse);
        assertTrue(mResponse.equals("something"));
        verify(mMockResponseHandler).sendResponseSuccessful(mResponse);
    }
}
