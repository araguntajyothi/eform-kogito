package com.bxs.app.rest;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customers") 
@RegisterRestClient
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface IdVerifyRemoteService {

    @PUT
    @Path("/{customerId}/id-verification") 
    void verifyCustomerID(@PathParam("customerId") String customerId, Object idVerificationRequest);
}
