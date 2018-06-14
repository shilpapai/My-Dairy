package com.example.demo;

import com.example.demo.resources.DemoResource;
import com.example.demo.resources.UserResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig{

    public JerseyConfig() {
        register(DemoResource.class);
        register(UserResource.class);
    }
}
