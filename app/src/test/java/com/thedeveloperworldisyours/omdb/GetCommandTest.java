package com.thedeveloperworldisyours.omdb;

import com.thedeveloperworldisyours.omdb.utils.Constants;
import com.thedeveloperworldisyours.omdb.webservice.Command;
import com.thedeveloperworldisyours.omdb.webservice.GetCommand;
import com.thedeveloperworldisyours.omdb.webservice.Request;
import com.thedeveloperworldisyours.omdb.webservice.RequestImpl;
import com.thedeveloperworldisyours.omdb.webservice.ResponseHandler;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

/**
 * Created by javierg on 12/08/16.
 */
public class GetCommandTest {
    String mUrl;
    ResponseHandler mMockResponseHandler;
    Request mMockRequestImpl;

    @Before
    public void setup() {

        mUrl = Constants.URL;
        mMockRequestImpl = mock(RequestImpl.class);
        mMockResponseHandler = mock(ResponseHandler.class);

    }

    @Test
    public void testGetCommandPerformsRequest() {
        mUrl = "here";


        GetCommand getCommand = new GetCommand(mUrl, mMockResponseHandler, mMockRequestImpl);

        getCommand.execute();

        verify(mMockRequestImpl).performGetRequest(mUrl, mMockResponseHandler);

        assertNotNull(getCommand);
    }
}
