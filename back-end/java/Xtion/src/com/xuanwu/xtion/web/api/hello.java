package com.xuanwu.xtion.web.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class hello {
	@GET
    @Produces("text/plain")
    public String getIt() {
        return "well come to java jersey restful api!";
    }
}
