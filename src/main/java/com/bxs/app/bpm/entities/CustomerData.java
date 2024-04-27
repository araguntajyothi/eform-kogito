package com.bxs.app.bpm.entities;

public class CustomerData {
    protected String customerNumber;

    // Default constructor for Jackson deserialization
    public CustomerData() {
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    @Override
    public String toString() {
        return "CustomerData[" + this.getCustomerNumber() + "]";
    }
}
