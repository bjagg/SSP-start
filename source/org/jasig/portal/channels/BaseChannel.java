package org.jasig.portal.channels;

import java.util.*;
import org.xml.sax.DocumentHandler;
import org.jasig.portal.*;

/**
 * A base class from which channels implementing IChannel interface can be derived.
 * Use this only if you are familiar with IChannel interface.
 * @author Peter Kharchenko
 * @version $Revision$
 */



public class BaseChannel implements IChannel
{
    protected ChannelStaticData staticData;
    protected ChannelRuntimeData runtimeData;
    protected String channelName;


    public BaseChannel() {
        channelName="BaseChannel";
    }

    public ChannelRuntimeProperties getRuntimeProperties ()
    {
        return new ChannelRuntimeProperties ();
    }

    public void receiveEvent (PortalEvent ev)
    {

    }

    public void setStaticData (ChannelStaticData sd) throws PortalException
    {
        this.staticData=sd;
    }


    public void setRuntimeData (ChannelRuntimeData rd) throws PortalException
    {
        this.runtimeData=rd;
    }

    public void renderXML (DocumentHandler out) throws PortalException
    {

    }

}
