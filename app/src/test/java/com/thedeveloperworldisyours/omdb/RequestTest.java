package com.thedeveloperworldisyours.omdb;

import com.thedeveloperworldisyours.omdb.model.Response;
import com.thedeveloperworldisyours.omdb.requestack.ClientHTTP;
import com.thedeveloperworldisyours.omdb.requestack.ClientHTTPFactory;
import com.thedeveloperworldisyours.omdb.utils.Constants;
import com.thedeveloperworldisyours.omdb.webservice.Request;
import com.thedeveloperworldisyours.omdb.webservice.RequestImpl;
import com.thedeveloperworldisyours.omdb.webservice.ResponseHandler;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by javierg on 12/08/16.
 */
public class RequestTest {

    Request mRequest;
    String mUrl;
    ResponseHandler mResponseHandler;
    ClientHTTP mockClientHTTP;

    @Before
    public void setUp() {
        mRequest = new RequestImpl();
        mResponseHandler = mock(ResponseHandler.class);
        mockClientHTTP = mock(ClientHTTP.class);
        mUrl = Constants.URL;
        ClientHTTPFactory.setMockClientHTTP(mockClientHTTP);
    }

    @Test
    public void requestSuccessful() {
        mRequest.performGetRequest(mUrl, mResponseHandler);
        verify(mockClientHTTP).get(mUrl);
    }

}
