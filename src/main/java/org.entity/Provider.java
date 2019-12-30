package org.entity;

import java.util.Date;

public class Provider {
    private String Pro_ID;
    private String Pro_Name;
    private String Pro_Tel;
    private String Pro_Address;
    private String Cargo_Type;
    private Date Pro_Date;

    public String getPro_ID() {
        return Pro_ID;
    }

    public void setPro_ID(String pro_ID) {
        Pro_ID = pro_ID;
    }

    public String getPro_Name() {
        return Pro_Name;
    }

    public void setPro_Name(String pro_Name) {
        Pro_Name = pro_Name;
    }

    public String getPro_Tel() {
        return Pro_Tel;
    }

    public void setPro_Tel(String pro_Tel) {
        Pro_Tel = pro_Tel;
    }

    public String getPro_Address() {
        return Pro_Address;
    }

    public void setPro_Address(String pro_Address) {
        Pro_Address = pro_Address;
    }

    public String getCargo_Type() {
        return Cargo_Type;
    }

    public void setCargo_Type(String cargo_Type) {
        Cargo_Type = cargo_Type;
    }

    public Date getPro_Date() {
        return Pro_Date;
    }

    public void setPro_Date(Date pro_Date) {
        Pro_Date = pro_Date;
    }

    @Override
    public String toString() {
        return "Provider{" +
                "Pro_ID='" + Pro_ID + '\'' +
                ", Pro_Name='" + Pro_Name + '\'' +
                ", Pro_Tel='" + Pro_Tel + '\'' +
                ", Pro_Address='" + Pro_Address + '\'' +
                ", Cargo_Type='" + Cargo_Type + '\'' +
                ", Pro_Date=" + Pro_Date +
                '}';
    }
}
