package com.thedeveloperworldisyours.omdb;

import com.thedeveloperworldisyours.omdb.model.Response;
import com.thedeveloperworldisyours.omdb.requestack.ClientAsyncTask;
import com.thedeveloperworldisyours.omdb.requestack.ClientAsyncTaskImpl;
import com.thedeveloperworldisyours.omdb.requestack.HttpURLConnectionFactory;
import com.thedeveloperworldisyours.omdb.utils.Constants;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/**
 * Created by javierg on 12/08/16.
 */
public class ClientHTTPTest {

    public ClientAsyncTask mClientAsyncTask;

    private HttpURLConnection mockConnection;

    String mUrl;
    String mType;

    @Before
    public void setup() {

        mClientAsyncTask = new ClientAsyncTaskImpl();

        mUrl = Constants.URL;
        mType = Constants.TYPE_STRING_GET;

    }

    @Test
    public void setClientHTTPWithOnPostExecuteSuccess() {

        mockConnection = mock(HttpURLConnection.class);

        try {
            when(mockConnection.getInputStream()).thenReturn(new ByteArrayInputStream("Hello".getBytes()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpURLConnectionFactory.setHttpURLConnection(mockConnection);

        Response response = mClientAsyncTask.callClient(mUrl, mType);

        try {
            verify(mockConnection).setRequestMethod(mType);
        } catch (ProtocolException e) {
            e.printStackTrace();
        }

        assertNotNull(response);
        assertFalse(response.isInternetError());
        assertTrue(response.getInfo() != null);
        assertTrue(response.getInfo().equals("Hello"));
    }

    @Test
    public void setClientHTTPWithOnPostExecuteFailure() {
        mockConnection = mock(HttpURLConnection.class);

        try {
            when(mockConnection.getInputStream()).thenThrow(new IOException());
        } catch (IOException e) {
            e.printStackTrace();
        }

        HttpURLConnectionFactory.setHttpURLConnection(mockConnection);

        Response response = mClientAsyncTask.callClient(mUrl, mType);

        assertNotNull(response);
        assertTrue(response.isInternetError());
        assertTrue(response.getInfo()==null);

    }
}
