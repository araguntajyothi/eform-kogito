/*
 * Customer WorkRequest Validation Service:
 *
 * Does roleId = CdoRm?
 * Does formTypeId = valid value?
 * 
 */
package com.bxs.app.bpm;

import javax.enterprise.context.ApplicationScoped;

import com.bxs.app.bpm.common.WorkRequest;

@ApplicationScoped
public class ValidationService {

    public WorkRequest validateWorkRequest(java.lang.String roleId, java.lang.String formTypeId) {
        WorkRequest workRequest = new WorkRequest();

        System.out.println("DEBUG: validateWorkRequest started. Inputs: roleId: " + roleId + ", formTypeId: " + formTypeId);


        if (roleId.toUpperCase().equals("CDORM")) {
            workRequest.setValidRole(true);
        } else {
            workRequest.setValidRole(false);
        }

        switch(formTypeId.toUpperCase()) {
            case "CUSTOMERINFORMATION":
            case "CUSTOMERNAMEMAINT":
            case "CUSTOMERIDENTIFICATION":
                workRequest.setValidFormType(true);
                break;
            default:
                workRequest.setValidFormType(false);
        }

        System.out.println("DEBUG: validateWorkRequest ending. Outputs: " + workRequest);

        return workRequest;
    }
}
