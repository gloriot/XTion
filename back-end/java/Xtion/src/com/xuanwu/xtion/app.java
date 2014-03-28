package com.xuanwu.xtion;

import org.glassfish.jersey.server.ResourceConfig;

public class app extends ResourceConfig {
    public app() {
    	packages("com.xuanwu.xtion.api");
    }
}
