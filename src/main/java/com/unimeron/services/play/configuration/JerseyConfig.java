package com.unimeron.services.play.configuration;

import com.unimeron.services.play.resource.RestResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig{

    private static final Logger LOGGER = LoggerFactory.getLogger(JerseyConfig.class);

    public JerseyConfig() {
        register( RestResource.class);
    }
}
