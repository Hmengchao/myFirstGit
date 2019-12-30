package org.entity;

public class Manager {
    private String Mana_Name;
    private String Mana_PWD;
    private String Popedom;
    private String Mana_Sex;
    private String Mana_Age;
    private String Mana_DepID;
    private String Mana_Tel;
    private String Mana_Address;

    public Manager() {
    }

    public Manager(String mana_Name, String mana_PWD, String popedom, String mana_Sex, String mana_Age, String mana_DepID, String mana_Tel, String mana_Address) {
        Mana_Name = mana_Name;
        Mana_PWD = mana_PWD;
        Popedom = popedom;
        Mana_Sex = mana_Sex;
        Mana_Age = mana_Age;
        Mana_DepID = mana_DepID;
        Mana_Tel = mana_Tel;
        Mana_Address = mana_Address;
    }

    public String getMana_Name() {
        return Mana_Name;
    }

    public void setMana_Name(String mana_Name) {
        Mana_Name = mana_Name;
    }

    public String getMana_PWD() {
        return Mana_PWD;
    }

    public void setMana_PWD(String mana_PWD) {
        Mana_PWD = mana_PWD;
    }

    public String getPopedom() {
        return Popedom;
    }

    public void setPopedom(String popedom) {
        Popedom = popedom;
    }

    public String getMana_Sex() {
        return Mana_Sex;
    }

    public void setMana_Sex(String mana_Sex) {
        Mana_Sex = mana_Sex;
    }

    public String getMana_Age() {
        return Mana_Age;
    }

    public void setMana_Age(String mana_Age) {
        Mana_Age = mana_Age;
    }

    public String getMana_DepID() {
        return Mana_DepID;
    }

    public void setMana_DepID(String mana_DepID) {
        Mana_DepID = mana_DepID;
    }

    public String getMana_Tel() {
        return Mana_Tel;
    }

    public void setMana_Tel(String mana_Tel) {
        Mana_Tel = mana_Tel;
    }

    public String getMana_Address() {
        return Mana_Address;
    }

    public void setMana_Address(String mana_Address) {
        Mana_Address = mana_Address;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "Mana_Name='" + Mana_Name + '\'' +
                ", Mana_PWD='" + Mana_PWD + '\'' +
                ", Popedom='" + Popedom + '\'' +
                ", Mana_Sex='" + Mana_Sex + '\'' +
                ", Mana_Age='" + Mana_Age + '\'' +
                ", Mana_DepID='" + Mana_DepID + '\'' +
                ", Mana_Tel='" + Mana_Tel + '\'' +
                ", Mana_Address='" + Mana_Address + '\'' +
                '}';
    }
}
