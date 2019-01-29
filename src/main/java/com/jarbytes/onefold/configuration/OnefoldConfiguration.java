package com.jarbytes.onefold.configuration;

import io.dropwizard.Configuration;

public class OnefoldConfiguration extends Configuration
{
    private String version;

    public String getVersion()
    {
        return version;
    }

    public void setVersion(final String version)
    {
        this.version = version;
    }
}
