package org.entity;

public class Cargo {
    private String Cargo_ID;
    private String Cargo_Name;
    private String Cargo_Type;

    public Cargo(String cargo_ID, String cargo_Name, String cargo_Type) {
        Cargo_ID = cargo_ID;
        Cargo_Name = cargo_Name;
        Cargo_Type = cargo_Type;
    }

    public Cargo() {
    }

    public String getCargo_ID() {
        return Cargo_ID;
    }

    public void setCargo_ID(String cargo_ID) {
        Cargo_ID = cargo_ID;
    }

    public String getCargo_Name() {
        return Cargo_Name;
    }

    public void setCargo_Name(String cargo_Name) {
        Cargo_Name = cargo_Name;
    }

    public String getCargo_Type() {
        return Cargo_Type;
    }

    public void setCargo_Type(String cargo_Type) {
        Cargo_Type = cargo_Type;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "Cargo_ID='" + Cargo_ID + '\'' +
                ", Cargo_Name='" + Cargo_Name + '\'' +
                ", Cargo_Type='" + Cargo_Type + '\'' +
                '}';
    }
}
