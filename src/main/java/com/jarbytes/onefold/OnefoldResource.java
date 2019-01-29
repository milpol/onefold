package com.jarbytes.onefold;

import com.jarbytes.onefold.configuration.OnefoldConfiguration;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import static java.util.Objects.requireNonNull;

@Path("/")
public class OnefoldResource
{
    private final OnefoldConfiguration onefoldConfiguration;

    OnefoldResource(final OnefoldConfiguration onefoldConfiguration)
    {
        this.onefoldConfiguration = requireNonNull(onefoldConfiguration);
    }

    @GET
    @Path("/version")
    public String getVersion()
    {
        return onefoldConfiguration.getVersion();
    }

    @GET
    @Path("/name")
    public String getName()
    {
        return "John Doe";
    }
}
