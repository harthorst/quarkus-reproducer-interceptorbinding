package org.acme.getting.started;

import javax.validation.Valid;
import javax.validation.constraints.Size;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/hello")
public interface IGreetingResource {
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @Path("/greeting/{name}")
    @CustomAnnotation
    public String greeting(@Valid @Size(min = 10) @PathParam String name);
}
