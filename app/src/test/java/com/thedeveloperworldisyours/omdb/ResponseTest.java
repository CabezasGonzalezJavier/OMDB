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
    private String mResponseErrorGeneral;
    private ResponseHandler mMockResponseHandler;
    public ResponseListener mMockResponseListener;

    @Before
    public void setUp() {
        mResponse = "something";
        mResponseErrorGeneral = "ERROR";
        mMockResponseHandler = mock(ResponseHandler.class);
        mMockResponseListener = new ResponseImpl(mMockResponseHandler);
    }

    @Test
    public void successful() {

        mMockResponseListener.onSuccess(mResponse);

        assertNotNull(mResponse);
        assertTrue(mResponse.equals("something"));
        verify(mMockResponseHandler).sendResponseSuccessful(mResponse);
    }

    @Test
    public void errorGeneral() {
        mMockResponseListener.onGeneralError();

        assertNotNull(mResponseErrorGeneral);
        assertTrue(mResponseErrorGeneral.equals("ERROR"));

        verify(mMockResponseHandler).sendResponseFail(mResponseErrorGeneral);
    }

    @Test
    public void sendResponseFailTest() {
        mMockResponseListener.onError(mResponse);
        assertNotNull(mResponse);

        assertTrue(mResponse.equals("something"));
        verify(mMockResponseHandler).sendResponseFail(mResponse);
    }
}
