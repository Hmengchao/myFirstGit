package org.entity;

public class Storage {
    private  String Cargo_ID;
    private int Storage_Num;

    @Override
    public String toString() {
        return "Storage{" +
                "Cargo_ID='" + Cargo_ID + '\'' +
                ", Storage_Num=" + Storage_Num +
                '}';
    }

    public String getCargo_ID() {
        return Cargo_ID;
    }

    public void setCargo_ID(String cargo_ID) {
        Cargo_ID = cargo_ID;
    }

    public int getStorage_Num() {
        return Storage_Num;
    }

    public void setStorage_Num(int storage_Num) {
        Storage_Num = storage_Num;
    }
}
