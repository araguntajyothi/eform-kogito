package com.bxs.app.bpm.services;

import com.bxs.app.rest.IdVerifyRemoteService;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class IdVerification {

    @Inject
    @RestClient
    IdVerifyRemoteService idVerifyRemoteService;

    @Fallback(fallbackMethod = "handleFallback")
    public void verifyCustomerID(String customerNumber, Object idVerificationRequest) {
        System.out.println("IdVerification: before...");
        System.out.println("Customer Number: " + customerNumber + ", Request: " + idVerificationRequest);

        try {
            idVerifyRemoteService.verifyCustomerID(customerNumber, idVerificationRequest);
            System.out.println("IdVerification: service call successful");
        } catch (Exception e) {
            System.out.println("IdVerification: service call failed");
            System.out.println("IdVerification: exception... " + e.toString());
            e.printStackTrace();
        }
        System.out.println("IdVerification: after...");
    }

    public void handleFallback(String customerNumber, Object idVerificationRequest) {
        System.out.println("IdVerification: Fallback invoked for customer Number: " + customerNumber);
        // Perform fallback logic if needed
    }
}
