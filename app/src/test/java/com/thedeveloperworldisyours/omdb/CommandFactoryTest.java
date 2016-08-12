package com.thedeveloperworldisyours.omdb;

import com.thedeveloperworldisyours.omdb.utils.Constants;
import com.thedeveloperworldisyours.omdb.webservice.Command;
import com.thedeveloperworldisyours.omdb.webservice.CommandFactory;
import com.thedeveloperworldisyours.omdb.webservice.GetCommand;
import com.thedeveloperworldisyours.omdb.webservice.RequestImpl;
import com.thedeveloperworldisyours.omdb.webservice.ResponseHandler;
import com.thedeveloperworldisyours.omdb.webservice.ResponseImpl;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static junit.framework.Assert.assertNotNull;
/**
 * Created by javierg on 12/08/16.
 */
public class CommandFactoryTest {

    String mUrl;
    int mType;

    ResponseHandler mMockResponseHandler;
    GetCommand mMockGetCommand;
    CommandFactory mCommandFactory;
    ResponseImpl mMockResponseImpl;
    RequestImpl mMockRequestImpl;

    @Before
    public void setUp() {
        mUrl = Constants.URL;

        mMockResponseHandler = mock(ResponseHandler.class);
        mMockGetCommand = mock(GetCommand.class);
        mCommandFactory = new CommandFactory();
        mMockResponseImpl = mock(ResponseImpl.class);
        mMockRequestImpl = mock(RequestImpl.class);

    }

    @Test
    public void executeTest() {

        Command command = mCommandFactory.createGetCommand(mUrl, mMockResponseHandler);

        assertNotNull(command);
        assertTrue(command.getClass().equals(GetCommand.class));
    }

}
