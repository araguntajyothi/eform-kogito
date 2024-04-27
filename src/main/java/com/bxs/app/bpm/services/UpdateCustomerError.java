package com.bxs.app.bpm.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UpdateCustomerError {
    private static final Logger logger = LoggerFactory.getLogger(UpdateCustomerError.class);

    public void attemptUpdate() {
        try {
            throw new RuntimeException("Failed to update customer");
        } catch (Exception e) {
            // Log the error message
            logger.error("Customer update has failed", e);
        }
    }

    public static void main(String[] args) {
        // Create an instance of UpdateCustomerError
        UpdateCustomerError updateCustomerError = new UpdateCustomerError();

        // Call the attemptUpdate method
        updateCustomerError.attemptUpdate();
    }
}
