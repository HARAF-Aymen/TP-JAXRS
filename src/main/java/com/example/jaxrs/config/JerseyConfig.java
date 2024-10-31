package com.example.jaxrs.config;

import org.glassfish.jersey.moxy.xml.MoxyXmlFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class JerseyConfig extends ResourceConfig {
    public JerseyConfig() {
        packages("com.example.jaxrs.rest");
        register(MoxyXmlFeature.class);
        register(CompteListMessageBodyWriter.class);
    }
}