package com.bxs.app.bpm.common;

public class PhoneNumber {
    private String action;
    private String number;
    private String sequence;
    private String usa;
    private String extension;
    private String phoneType;

    // Default constructor for Jackson deserialization
    public PhoneNumber() {
    }

    public PhoneNumber(String action, String number, String sequence, String usa, String extension, String phoneType) {
        this.action = action;
        this.number = number;
        this.sequence = sequence;
        this.usa = usa;
        this.extension = extension;
        this.phoneType = phoneType;
    }

    public String getAction() {
        return this.action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSequence() {
        return this.sequence;
    }

    public void setSequence(String sequence) {
        this.sequence = sequence;
    }

    public String getUsa() {
        return this.usa;
    }

    public void setUsa(String usa) {
        this.usa = usa;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getPhoneType() {
        return this.phoneType;
    }

    public void setPhoneType(String phoneType) {
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "PhoneNumber[" + this.number + ", " + this.sequence + ", " + this.usa + ", " + this.extension + ", " + this.phoneType + "]";
    }
}
