package com.bxs.app.bpm.entities;

import com.bxs.app.bpm.common.PhoneNumber;

import java.util.List;

public class CustomerInfo extends CustomerData {
    private String type;
    private String shortName; 
    private String province;
    private String doNotCombineIndicator;
    private String doNotDeleteIndicator;
    private String taxId;
    private String tinCode;
    private String tinCertCode;
    private List<PhoneNumber> phoneNumbers;


    // Default constructor for Jackson deserialization
    public CustomerInfo() {
    }

    public CustomerInfo(String customerNumber, List<PhoneNumber> phoneNumbers) {
        this.customerNumber = customerNumber;
        this.phoneNumbers = phoneNumbers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getDoNotCombineIndicator() {
        return doNotCombineIndicator;
    }

    public void setDoNotCombineIndicator(String doNotCombineIndicator) {
        this.doNotCombineIndicator = doNotCombineIndicator;
    }

    public String getDoNotDeleteIndicator() {
        return doNotDeleteIndicator;
    }

    public void setDoNotDeleteIndicator(String doNotDeleteIndicator) {
        this.doNotDeleteIndicator = doNotDeleteIndicator;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

    public String getTinCode() {
        return tinCode;
    }

    public void setTinCode(String tinCode) {
        this.tinCode = tinCode;
    }

    public String getTinCertCode() {
        return tinCertCode;
    }

    public void setTinCertCode(String tinCertCode) {
        this.tinCertCode = tinCertCode;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return this.phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumber> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "CustomerInfo[" + this.getCustomerNumber() + ", " + this.phoneNumbers + "]";
    }
}
