/*
 * EForms Work Request
 *
 * Common data object for interacting with WorkRequests
 * 
 * 
 */
package com.bxs.app.bpm.common;

public class WorkRequest implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.lang.String roleId;
    private java.lang.Integer level;
    private java.lang.String formTypeId;
    private Submitter submitter;
    // private java.lang.String accountType;
    // private java.lang.String accountNbr;
    // private java.lang.String customerNbr;
    // private java.lang.String caseJSON;

    private java.lang.Boolean validRole;
    private java.lang.Boolean validFormType;

    public WorkRequest() {
        this.validRole = false;
        this.validFormType = false;
    }

    public java.lang.String getRoleId() {
        return this.roleId;
    }

    public void setRoleId(java.lang.String roleId) {
        this.roleId = roleId;
    }

    public java.lang.Integer getLevel() {
        return this.level;
    }

    public void setLevel(java.lang.Integer level) {
        this.level = level;
    }

    public java.lang.String getFormTypeId() {
        return this.formTypeId;
    }

    public void setFormTypeId(java.lang.String formTypeId) {
        this.formTypeId = formTypeId;
    }

    public Submitter getSubmitter() {
        return this.submitter;
    }

    public void setSubmitter(Submitter submitter) {
        this.submitter = submitter;
    }

/*
    public java.lang.Boolean isShipped() {
        return this.shipped;
    }

    public void setShipped(java.lang.Boolean shipped) {
        this.shipped = shipped;
    }

    public java.lang.Double getTotal() {
        return this.total;
    }

    public void setTotal(java.lang.Double total) {
        this.total = total;
    }

    public WorkRequest(java.lang.String orderNumber, java.lang.Boolean shipped,
            java.lang.Double total) {
        this.orderNumber = orderNumber;
        this.shipped = shipped;
        this.total = total;
    }
*/

    public void setValidRole(java.lang.Boolean validRole) {
        this.validRole = validRole;
    }

    public java.lang.Boolean isValidRole() {
        return this.validRole;
    }

    public void setValidFormType(java.lang.Boolean validFormType) {
        this.validFormType = validFormType;
    }

    public java.lang.Boolean isValidFormType() {
        return this.validFormType;
    }

    public String toString() {
        return "WorkRequest[" + this.validRole + ", " + this.validFormType + "]";
    }


}