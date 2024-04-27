package com.bxs.app.bpm.common;

public class UpdateCustomerName {
    private String customerNumber;
    private String name1Type;
    private String name1;
    private String name2Type;
    private String name2;
    private String name3Type;
    private String name3;
    private String name4Type;
    private String name4;

    public UpdateCustomerName() {
    }

    public UpdateCustomerName(String customerNumber, String name1Type, String name1, String name2Type, String name2,
            String name3Type, String name3, String name4Type, String name4) {
        this.customerNumber = customerNumber;
        this.name1Type = name1Type;
        this.name1 = name1;
        this.name2Type = name2Type;
        this.name2 = name2;
        this.name3Type = name3Type;
        this.name3 = name3;
        this.name4Type = name4Type;
        this.name4 = name4;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getName1Type() {
        return name1Type;
    }

    public void setName1Type(String name1Type) {
        this.name1Type = name1Type;
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getName2Type() {
        return name2Type;
    }

    public void setName2Type(String name2Type) {
        this.name2Type = name2Type;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getName3Type() {
        return name3Type;
    }

    public void setName3Type(String name3Type) {
        this.name3Type = name3Type;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getName4Type() {
        return name4Type;
    }

    public void setName4Type(String name4Type) {
        this.name4Type = name4Type;
    }

    public String getName4() {
        return name4;
    }

    public void setName4(String name4) {
        this.name4 = name4;
    }

    @Override
    public String toString() {
        return "UpdateCustomerName{" + "customerNumber='" + customerNumber + '\'' + ", name1Type='" + name1Type + '\''
                + ", name1='" + name1 + '\'' + ", name2Type='" + name2Type + '\'' + ", name2='" + name2 + '\''
                + ", name3Type='" + name3Type + '\'' + ", name3='" + name3 + '\'' + ", name4Type='" + name4Type + '\''
                + ", name4='" + name4 + '\'' + '}';
    }
}
