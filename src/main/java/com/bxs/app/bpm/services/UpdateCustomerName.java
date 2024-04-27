package com.bxs.app.bpm.services;

import com.bxs.app.rest.UpdateCustomerNameRemoteService;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class UpdateCustomerName {

    @Inject
    @RestClient
    UpdateCustomerNameRemoteService updateCustomerNameRemote;

    @Fallback(fallbackMethod = "handleFallback")
    public void updateCustomerName(String customerNumber, Object updateCustomerNameRequest) {
        System.out.println("UpdateCustomerName: before...");
        System.out.println("Customer Number: " + customerNumber + ", UpdateCustomerNameRequest: " + updateCustomerNameRequest);

        try {
            updateCustomerNameRemote.updateCustomerName(customerNumber, updateCustomerNameRequest);
            System.out.println("UpdateCustomerName: service call successful");
        } catch (Exception e) {
            System.out.println("UpdateCustomerName: service call failed");
            System.out.println("UpdateCustomerName: exception... " + e.toString());
            e.printStackTrace();
        }
        System.out.println("UpdateCustomerName: after...");
    }

    public void handleFallback(String customerNumber, Object updateCustomerNameRequest) {
        System.out.println("UpdateCustomerName: Fallback invoked for customer Number: " + customerNumber);
        
    }
}
