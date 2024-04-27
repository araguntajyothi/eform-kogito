package com.bxs.app.bpm.services;

import com.bxs.app.rest.CustomerRemoteService;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class UpdateCustomerInfo {

    @Inject
    @RestClient
    CustomerRemoteService customerRemoteService;

    @Fallback(fallbackMethod = "missingCustomer")
    public Response updateCustomerInfo(String customerNumber, Object caseDetails) {
        System.out.println("UpdateCustomer.CustomerService: before...");
        System.out.println("Customer Nr: " + customerNumber + ", caseDetails: " + caseDetails);

        Response resp = null;

        try {
            resp = customerRemoteService.updateCustomerInfo(customerNumber, caseDetails);
        } catch (Exception e) {
            System.out.println("UpdateCustomer.CustomerService: exception... " + e.toString());
            e.printStackTrace();
        }
        System.out.println("UpdateCustomer.CustomerService: after... ");
        System.out.println("UpdateCustomer.CustomerService: Response: " + resp);
        return resp;
    }

    public Response missingCustomer(String customerNumber, Object caseDetails) {
        return null;
    }
}
