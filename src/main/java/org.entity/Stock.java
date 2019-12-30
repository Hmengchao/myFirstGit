package org.entity;

public class Stock {
    private String id;
    private String Cargo_ID;
    private String Stock_Num;
    private double Stock_Price;
    private String Mana_Name;

    public Stock() {
    }

    public Stock(String id, String cargo_ID, String stock_Num, double stock_Price, String mana_Name) {
        this.id = id;
        Cargo_ID = cargo_ID;
        Stock_Num = stock_Num;
        Stock_Price = stock_Price;
        Mana_Name = mana_Name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCargo_ID() {
        return Cargo_ID;
    }

    public void setCargo_ID(String cargo_ID) {
        Cargo_ID = cargo_ID;
    }

    public String getStock_Num() {
        return Stock_Num;
    }

    public void setStock_Num(String stock_Num) {
        Stock_Num = stock_Num;
    }

    public double getStock_Price() {
        return Stock_Price;
    }

    public void setStock_Price(double stock_Price) {
        Stock_Price = stock_Price;
    }


    @Override
    public String toString() {
        return "Stock{" +
                "id=" + id +
                ", Cargo_ID='" + Cargo_ID + '\'' +
                ", Stock_Num='" + Stock_Num + '\'' +
                ", Stock_Price=" + Stock_Price +
                ", Mana_Name='" + Mana_Name + '\'' +
                '}';
    }

    public String getMana_Name() {
        return Mana_Name;
    }

    public void setMana_Name(String mana_Name) {
        Mana_Name = mana_Name;
    }
}
