package com.bxs.app.bpm.services;

import com.bxs.app.bpm.common.UpdateCaseRequest;
import com.bxs.app.bpm.common.Submitter;
import com.bxs.app.rest.UpdateCaseStatusRemoteService;
import org.eclipse.microprofile.faulttolerance.Fallback;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

@ApplicationScoped
public class UpdateCaseStatus {

    @Inject
    @RestClient
    UpdateCaseStatusRemoteService updateCaseStatusRemoteService;

    @Fallback(fallbackMethod = "handleFallback")
    public void updateCaseStatus(String caseId, String statusId, Submitter submitterInfo) {
        System.out.println("UpdateCaseStatus: before...");
        System.out.println("Case ID: " + caseId + ", statusId: " + statusId + ", submitterInfo: " + submitterInfo);

        UpdateCaseRequest updateCaseRequest = new UpdateCaseRequest(statusId, 0, submitterInfo.getId());

        System.out.println("Case ID: " + caseId + ", updateCaseRequest: " + updateCaseRequest);

        try {
            updateCaseStatusRemoteService.updateCaseStatus(caseId, updateCaseRequest);
            System.out.println("UpdateCaseStatus: service call successful");
        } catch (Exception e) {
            System.out.println("UpdateCaseStatus: service call failed");
            System.out.println("UpdateCaseStatus: exception... " + e.toString());
            e.printStackTrace();
        }
        System.out.println("UpdateCaseStatus: after...");
    }

    public void handleFallback(String caseId, String statusId, Submitter submitterInfo) {
        System.out.println("UpdateCaseStatus: Fallback invoked for case ID: " + caseId);
        
    }
}
