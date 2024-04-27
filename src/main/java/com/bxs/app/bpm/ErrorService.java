/*
 * Error Testing Service:
 * 
 */
package com.bxs.app.bpm;

import javax.enterprise.context.ApplicationScoped;
import java.lang.Exception;

@ApplicationScoped
public class ErrorService {

    public void testError() throws Exception {

        Exception exception = new Exception("General Exception requests your attention.");
        throw exception;
    }
}
