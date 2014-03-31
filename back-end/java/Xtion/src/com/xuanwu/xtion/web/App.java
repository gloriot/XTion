/*
 *author:weichangying
 *date:2014-03-29
 *remark:the jersey restful framework global resource config for scanning the package of restful service class
 */
package com.xuanwu.xtion.web;

import org.glassfish.jersey.server.ResourceConfig;

/*
 * the config extension of ResourceConfig 
 */
public class App extends ResourceConfig {
    public App() {
    	//define the package location of restful api services which will auto scan by the jersey.
    	packages("com.xuanwu.xtion.web.api");
    }
}
