package com.jarbytes.onefold;

import com.jarbytes.onefold.configuration.OnefoldConfiguration;
import io.dropwizard.Application;
import io.dropwizard.assets.AssetsBundle;
import io.dropwizard.bundles.webjars.WebJarBundle;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class OnefoldApplication extends Application<OnefoldConfiguration>
{
    @Override
    public void initialize(final Bootstrap<OnefoldConfiguration> bootstrap)
    {
        bootstrap.addBundle(new WebJarBundle("org.webjars.npm"));
        bootstrap.addBundle(new AssetsBundle("/assets", "/", "index.html"));
    }

    @Override
    public void run(final OnefoldConfiguration onefoldConfiguration,
                    final Environment environment)
    {
        environment.jersey().register(new OnefoldResource(onefoldConfiguration));
    }

    public static void main(final String[] args) throws Exception
    {
        new OnefoldApplication().run(args);
    }
}
