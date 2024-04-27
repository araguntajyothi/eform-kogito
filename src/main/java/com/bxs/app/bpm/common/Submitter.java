
/*
 * EForms Work Request
 *
 * Common data object for interacting with WorkRequests
 * 
 * 
 */
package com.bxs.app.bpm.common;

public class Submitter implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.lang.String id;
    private java.lang.String email;
    private java.lang.String region;

    public Submitter() {
    }

    public java.lang.String getId() {
        return this.id;
    }

    public void setId(java.lang.String id) {
        this.id = id;
    }

    public java.lang.String getEmail() {
        return this.email;
    }

    public void setEmail(java.lang.String email) {
        this.email = email;
    }

    public java.lang.String getRegion() {
        return this.region;
    }

    public void setRegion(java.lang.String region) {
        this.region = region;
    }

    public Submitter(java.lang.String id, java.lang.String email,
            java.lang.String region) {
        this.id = id;
        this.email = email;
        this.region = region;
    }

    public String toString() {
        return "Submitter[" + this.id + ", " + this.email + ", " + this.region + "]";
    }

}