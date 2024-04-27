package com.bxs.app.rest;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customers") // Base path
@RegisterRestClient(configKey = "customer-orchestrator-api") // Configured base URL key
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface UpdateCustomerNameRemoteService {

    @PUT
    @Path("/{customerNumber}/names") // Endpoint path
    void updateCustomerName(@PathParam("customerNumber") String customerNumber, Object updateCustomerName);
}
