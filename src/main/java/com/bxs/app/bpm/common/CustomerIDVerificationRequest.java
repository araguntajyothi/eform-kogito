package com.bxs.app.bpm.common;

public class CustomerIDVerificationRequest {
    private String customerNumber;
    private String customerType;
    private Identification[] identifications;

    public CustomerIDVerificationRequest() {
    }

    public CustomerIDVerificationRequest(String customerNumber, String customerType, Identification[] identifications) {
        this.customerNumber = customerNumber;
        this.customerType = customerType;
        this.identifications = identifications;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Identification[] getIdentifications() {
        return identifications;
    }

    public void setIdentifications(Identification[] identifications) {
        this.identifications = identifications;
    }

    @Override
    public String toString() {
        return "CustomerIDVerificationRequest{" +
                "customerNumber='" + customerNumber + '\'' +
                ", customerType='" + customerType + '\'' +
                ", identifications=" + java.util.Arrays.toString(identifications) +
                '}';
    }

    public static class Identification {
        private String type;
        private String number;
        private String code;
        private String verifyDate;
        private String verifyStatus;
        private String verifyType;
        private String expDate;
        private String issueDate;

        public Identification() {
        }

        public Identification(String type, String number, String code, String verifyDate, String verifyStatus, String verifyType, String expDate, String issueDate) {
            this.type = type;
            this.number = number;
            this.code = code;
            this.verifyDate = verifyDate;
            this.verifyStatus = verifyStatus;
            this.verifyType = verifyType;
            this.expDate = expDate;
            this.issueDate = issueDate;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getVerifyDate() {
            return verifyDate;
        }

        public void setVerifyDate(String verifyDate) {
            this.verifyDate = verifyDate;
        }

        public String getVerifyStatus() {
            return verifyStatus;
        }

        public void setVerifyStatus(String verifyStatus) {
            this.verifyStatus = verifyStatus;
        }

        public String getVerifyType() {
            return verifyType;
        }

        public void setVerifyType(String verifyType) {
            this.verifyType = verifyType;
        }

        public String getExpDate() {
            return expDate;
        }

        public void setExpDate(String expDate) {
            this.expDate = expDate;
        }

        public String getIssueDate() {
            return issueDate;
        }

        public void setIssueDate(String issueDate) {
            this.issueDate = issueDate;
        }

        @Override
        public String toString() {
            return "Identification{" +
                    "type='" + type + '\'' +
                    ", number='" + number + '\'' +
                    ", code='" + code + '\'' +
                    ", verifyDate='" + verifyDate + '\'' +
                    ", verifyStatus='" + verifyStatus + '\'' +
                    ", verifyType='" + verifyType + '\'' +
                    ", expDate='" + expDate + '\'' +
                    ", issueDate='" + issueDate + '\'' +
                    '}';
        }
    }
}
