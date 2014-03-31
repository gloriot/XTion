/*
 *author:weichangying
 *date:2014-03-29
 *remark:this is a demo of restful api,when the app is running,
 *       you can type the http://localhost:8080/api/hello to see it how to work!
 */
package com.xuanwu.xtion.web.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class Hello {
	@GET
    @Produces("text/plain")
    public String getIt() {
        return "well come to java jersey restful api!";
    }
}
