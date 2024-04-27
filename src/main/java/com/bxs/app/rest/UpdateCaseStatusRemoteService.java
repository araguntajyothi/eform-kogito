package com.bxs.app.rest;

import com.bxs.app.bpm.common.UpdateCaseRequest;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/case")
@RegisterRestClient
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface UpdateCaseStatusRemoteService {

    @PUT
    @Path("/{caseId}")
    void updateCaseStatus(@PathParam("caseId") String caseId, UpdateCaseRequest updateCaseRequest);
}
